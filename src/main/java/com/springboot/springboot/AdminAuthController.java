package com.springboot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class AdminAuthController {
    @GetMapping("/admin")
    public String welcomeAdmin(){
        return "Welcome Admin";
    }

}
