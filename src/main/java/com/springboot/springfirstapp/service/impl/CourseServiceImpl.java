package com.springboot.springfirstapp.service.impl;

import com.springboot.springfirstapp.entity.course;
import com.springboot.springfirstapp.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    List<course> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new course(145,"KARAN","Describe"));
        list.add(new course(1405,"1KARAN","Describe2"));
    }



    @Override
    public List<course> getCourses() {
        return list;
    }

    @Override
    public course getCourse(int id){
        course temp=null;
        for(course it:list){
            if(it.getId()==id){
                return it;
            }
        }
        return null;


    }

    @Override
    public void addPost(course temp){
        list.add(temp);
        return ;
    }

    @Override
    public course update(int id, course temp) {
         course use1=null;
         for(course it:list){
             if(it.getId()==id){
                 it.setDescription(temp.getDescription());
                 it.setTitle(temp.getTitle());
             }
         }
         return use1;
    }


}
