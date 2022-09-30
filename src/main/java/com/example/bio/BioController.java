package com.example.bio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BioController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/bio")
    public Bio greeting(@RequestParam(value = "title", defaultValue = "Engineer") String title){
        return new Bio(counter.incrementAndGet(), String.format(template, title));
    }
}
