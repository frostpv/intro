package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UsersController {
    @GetMapping(value = "/users/")
    public String getAllUser() {
        return "users";
    }
}
