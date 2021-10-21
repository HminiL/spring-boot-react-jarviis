package shop.jarviis.api.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shop.jarviis.api.backend.user.domain.User;
import shop.jarviis.api.backend.user.domain.UserDTO;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Transactional
    @Query(value = "select u.username, u.user_id userId, u.name, u.email, u.reg_date regDate, u.password  " +
            "from users u where u.username = :username and u.password = :password",
            nativeQuery = true)
    Optional<User> login(@Param("username") String username, @Param("password") String password);
//
//    @Transactional
//    @Query(value = "select username, password from users where users.username=:username and users.password=:password",
//    nativeQuery = true)
//    UserDTO login(@Param("username") String username, @Param("password") String password);
}
// =: '같다' 의미, ==와 유사한 문법
