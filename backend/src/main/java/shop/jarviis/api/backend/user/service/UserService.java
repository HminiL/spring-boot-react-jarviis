package shop.jarviis.api.backend.user.service;

import shop.jarviis.api.backend.user.domain.User;
import shop.jarviis.api.backend.user.domain.UserDTO;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(long userId);
    Optional<User> login(String username, String password);
}
