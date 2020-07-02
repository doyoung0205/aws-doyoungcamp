package com.doyoungcamp.aws.springbootapp.hello.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }
}
