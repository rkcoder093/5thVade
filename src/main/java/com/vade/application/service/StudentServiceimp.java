package com.vade.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vade.application.entity.Course;
import com.vade.application.repositery.StudentRepositery;

@Service
public class StudentServiceimp  implements StudetnService{

    @Autowired
    StudentRepositery sRepo;

    @Override
    public List<Course> getCourses() {
        // TODO Auto-generated method stub
        return sRepo.findAll();

    }
    
}
