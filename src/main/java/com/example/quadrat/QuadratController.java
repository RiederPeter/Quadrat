package com.example.quadrat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadratController {
    @GetMapping("/square")
    public int square(int a){
        return a*a;
    }
}
