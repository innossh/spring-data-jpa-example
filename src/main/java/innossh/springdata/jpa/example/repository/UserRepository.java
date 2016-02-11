package innossh.springdata.jpa.example.repository;

import innossh.springdata.jpa.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
