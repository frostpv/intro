package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
    @GetMapping(value = "/users/")
    public String getAllUser() {
        return "users";
    }
}
