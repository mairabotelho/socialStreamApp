package finalProject.socialStream.repositories;

import finalProject.socialStream.models.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

    Video findByVideoId(Long videoId);
}
