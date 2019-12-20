package finalProject.socialStream.repositories;


import finalProject.socialStream.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    Admin findByAdminName(String adminName);
}
