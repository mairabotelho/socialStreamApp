package finalProject.socialStream.repositories;

import finalProject.socialStream.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

//    Comment findAllByUserId(Long userId);
//
//    Comment addByVideoId(Long videoId);
//
//    Iterable<String> findAllByVideoId(Long videoId);
}
