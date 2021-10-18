package shop.jarviis.api.backend.user.service;

import shop.jarviis.api.backend.user.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(long userid);
}
