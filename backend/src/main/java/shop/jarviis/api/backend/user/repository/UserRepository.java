package shop.jarviis.api.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.jarviis.api.backend.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
