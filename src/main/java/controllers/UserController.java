package controllers;

import dto.UserResponseDto;
import java.util.List;
import java.util.stream.Collectors;
import models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public UserResponseDto getUser(@PathVariable Long userId) {
        return transformUserToUserResponseDto(userService.getById(userId));
    }

    @GetMapping("/inject")
    public void injectUser() {
        User vasya = new User();
        vasya.setEmail("frostpv@gmail.com");
        vasya.setName("Vasya");
        userService.add(vasya);
        User ira = new User();
        ira.setEmail("irina@gmail.com");
        ira.setName("Irina");
        userService.add(ira);
    }

    @GetMapping
    public List<UserResponseDto> getAllUser() {
        return userService.listUsers().stream()
                .map(this::transformUserToUserResponseDto)
                .collect(Collectors.toList());
    }

    private UserResponseDto transformUserToUserResponseDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        return userResponseDto;
    }
}
