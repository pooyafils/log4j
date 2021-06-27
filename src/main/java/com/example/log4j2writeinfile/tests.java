package com.example.log4j2writeinfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class tests {
    @GetMapping
    public String te(){

        return "log";
    }

}
