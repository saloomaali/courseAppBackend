package com.NeST.courseAppBackend1.controller;

import com.NeST.courseAppBackend1.model.Courses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseController {

    @PostMapping(path = "/")
    public String welcomeCourse(){
        return "Welcome to course app";
    }
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addCourse(@RequestBody Courses c){
        System.out.println(c.getTitle() + "\n" + c.getDescription() + "\n" + c.getVenue() + "\n" + c.getDuration() + "\n" + c.getDate());
        return "course added successfully";
    }


}
