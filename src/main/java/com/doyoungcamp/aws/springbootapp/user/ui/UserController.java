package com.doyoungcamp.aws.springbootapp.user.ui;

import com.doyoungcamp.aws.springbootapp.user.application.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping({"/", "hello"})
    public String helloWorld(Model model) {
        model.addAttribute("userList", userService.getAllUserList());
        return "index";
    }
}
