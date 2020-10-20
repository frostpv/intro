package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = "/{userId}")
    public String getUser(@PathVariable Long userId) {
        return ""+userId;
    }

    @GetMapping(value = "/inject")
    public String injectUser() {
        return "test inject";
    }
    @GetMapping(value = "/")
    public String getAllUser() {
        return "users-test";
    }
}
