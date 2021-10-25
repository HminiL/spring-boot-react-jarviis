package shop.jarviis.api.backend.user.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.jarviis.api.backend.common.CommonController;
import shop.jarviis.api.backend.user.domain.User;
import shop.jarviis.api.backend.user.domain.UserDTO;
import shop.jarviis.api.backend.user.repository.UserRepository;
import shop.jarviis.api.backend.user.service.UserService;

import java.util.List;
import java.util.Optional;


@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController implements CommonController<User, Long> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final UserService userService;
    private final UserRepository userRepository;

//    @PostMapping()
//    public ResponseEntity<User> join(@RequestBody User user){
//        logger.info(String.format("User Join Info is %s", user.toString()));
//        return null;
//    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDTO user){
        return ResponseEntity.ok(userService.login(user.getUsername(), user.getPassword()).get());
    }

//    @PostMapping("/maria")
//    public ResponseEntity<String> login(@RequestBody UserDTO user){
//        UserDTO returnUser = userService.login(user.getUsername(), user.getPassword());
//        System.out.println("미리아DB에서 넘어온 정보 : " + returnUser.toString());
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<UserDTO> getById(@PathVariable long id) {
//        System.out.println("----------------------");
//        User user = userService.findById(id).get();
//        UserDTO returnUser = UserDTO.builder()
//                .userId(user.getUserId())
//                .username(user.getUsername())
//                .password(user.getPassword())
//                .name(user.getName())
//                .email(user.getEmail())
//                .regDate(user.getRegDate())
//                .build();
//        return new ResponseEntity<>(returnUser, HttpStatus.OK);
//    }


    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<User> getById(@PathVariable Long id) {
        return ResponseEntity.ok(userRepository.getById(id));
    }

    @PostMapping
    @Override
    public ResponseEntity<String> save(@RequestBody User user) {
        logger.info(String.format("회원가입 정보 %s", user.toString()));
        userRepository.save(user);
        return ResponseEntity.ok("SUCCESS");
    }
    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user){
        logger.info(String.format("회원수정 정보 : %s", user.toString()));
        userRepository.save(user);
        return ResponseEntity.ok(userRepository.getById(user.getUserId()));
    }


    @Override
    public ResponseEntity<Optional<User>> findById( Long id) {
        return ResponseEntity.ok(userRepository.findById(id));
    }

    @Override
    public ResponseEntity<Boolean> existsById(Long id) {
        return ResponseEntity.ok(userRepository.existsById(id));
    }

    @Override
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(userRepository.count());
    }

    @Override
    public ResponseEntity<String> deleteById(Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("SUCCESS");
    }
}
