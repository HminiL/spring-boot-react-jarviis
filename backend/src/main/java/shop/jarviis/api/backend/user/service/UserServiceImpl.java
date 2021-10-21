package shop.jarviis.api.backend.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.jarviis.api.backend.user.domain.User;
import shop.jarviis.api.backend.user.domain.UserDTO;
import shop.jarviis.api.backend.user.repository.UserRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public Optional<User> findById(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Optional<User> login(String username, String password) {
        return userRepository.login(username, password);
    }
}
