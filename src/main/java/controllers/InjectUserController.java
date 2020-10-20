package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InjectUserController {
    @GetMapping(value = "/user/inject")
    public void injectUser() {

    }
}
