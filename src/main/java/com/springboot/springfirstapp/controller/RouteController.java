package com.springboot.springfirstapp.controller;

import com.springboot.springfirstapp.entity.course;
import com.springboot.springfirstapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(){
        return "This is Home Page";
    }

    @GetMapping("/courses")
    public List<course> GetCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
     public course getCourse(@PathVariable int id){
        return this.courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public void postCourse(@RequestBody course temp){
        System.out.println(temp);
        this.courseService.addPost(temp);
        return ;
    }

    @PutMapping("/courses/{id}/{name}")
    public course update(@PathVariable("id") int id,@RequestBody course temp){
        System.out.println(temp);
        return this.courseService.update(id,temp);

    }

}
