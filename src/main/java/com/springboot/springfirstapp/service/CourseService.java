package com.springboot.springfirstapp.service;


import com.springboot.springfirstapp.entity.course;

import java.util.List;

public interface CourseService {

    public List<course> getCourses();
    public course getCourse(int id);
    public void addPost(course temp);
    public course update(int id,course temp);

}
