package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
    @GetMapping(value = "/user/{userId}")
    public String getUser() {
        return "";
    }

    @GetMapping(value = "/user/inject")
    public String injectUser() {
        return "test inject";
    }
    @GetMapping(value = "/user/")
    public String getAllUser() {
        return "users-test";
    }
}
