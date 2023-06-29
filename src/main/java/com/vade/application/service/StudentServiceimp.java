package com.vade.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vade.application.entity.Course;
import com.vade.application.entity.Lesson;
import com.vade.application.repositery.CourseRepo;
import com.vade.application.repositery.LessonRepo;
import com.vade.application.repositery.StudentRepositery;

@Service
public class StudentServiceimp  implements StudetnService{

    @Autowired
    StudentRepositery sRepo;

    @Autowired
    CourseRepo cRepo;

    @Autowired
    LessonRepo lRepo;

    @Override
    public List<Course> getCourses() {
        // TODO Auto-generated method stub
        return cRepo.findAll();

    }

    @Override
    public Lesson getLesson(int id) {
        // TODO Auto-generated method stub
        return lRepo.findById(id).get();
    }
    
}
