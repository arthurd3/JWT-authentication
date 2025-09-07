package com.arthur.securityjwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/welcome")
    public String allAccess(){
        return "Welcome to Spring Security JWT!";
    }

    @GetMapping("/user")
    public String userAccess(){
        return "Welcome User to Spring Security JWT!";
    }

    @GetMapping("/special")
    public String specialAccess(){
        return "Welcome Spring Security JWT!";
    }
}
