package com.renan.Santander_dev.Controller;
import com.renan.Santander_dev.Service.impl.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    public final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }



}
