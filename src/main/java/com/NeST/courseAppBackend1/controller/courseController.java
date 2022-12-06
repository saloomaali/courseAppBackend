package com.NeST.courseAppBackend1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseController {

    @PostMapping(path = "/")
    public String welcomeCourse(){
        return "Welcome to course app";
    }


}
