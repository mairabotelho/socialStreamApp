package finalProject.socialStream.controllers;

import finalProject.socialStream.models.Comment;
import finalProject.socialStream.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/video")
public class CommentController {
    @Autowired
    CommentService commentService;
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PostMapping("/video/{videoId}")
    public ResponseEntity<Comment> postComment(@Valid @RequestBody Comment comment, @PathVariable Long videoId,
                                               @RequestParam Long userId){
        return new ResponseEntity<>(commentService.addCommentToVideo(comment, videoId, userId), HttpStatus.CREATED);
    }

    @GetMapping("/video/{videoId}")
    public  ResponseEntity<Iterable<String>> getAllCommentsFromVideo(@PathVariable Long videoId){
        return new ResponseEntity<>(commentService.getAllByVideoId(videoId), HttpStatus.OK);
    }
}
