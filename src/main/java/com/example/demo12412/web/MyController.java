package com.example.demo12412.web;


import com.example.demo12412.dto.Bird;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pwd")
public class MyController {
    

    @GetMapping
    public String secretCodeReveal() {
        return "qwerty123!";
    }

    @GetMapping("/secret")
    public String evenMoreSecretCodeReveal() {
        return "qwerty123$%!";
    }

}

