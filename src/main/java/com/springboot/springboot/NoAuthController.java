package com.springboot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/noAuth")
public class NoAuthController {
@GetMapping("/both")
    public String displayWelcomeToBoth(){

        return "Welcome user and Admin";
    }
}
