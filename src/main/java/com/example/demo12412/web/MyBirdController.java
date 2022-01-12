package com.example.demo12412.web;


import com.example.demo12412.dto.Bird;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("bird")
public class MyBirdController {

    Bird currentBird = new Bird();
    List<Bird> birds = new ArrayList<>();


    @GetMapping
    public Bird getBird() {
        return currentBird;
    }

    @GetMapping("/all")
    public List<Bird> getAllBirds() {
        return birds;
    }

    @PostMapping
    public String addBird(@RequestBody Bird bird) {
        birds.add(bird);
        return "ok";
    }

    @DeleteMapping
    public String killBird() {
        currentBird = null;
        return "Done!";
    }

}

