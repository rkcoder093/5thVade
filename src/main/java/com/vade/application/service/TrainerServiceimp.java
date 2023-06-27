package com.vade.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vade.application.entity.Course;
import com.vade.application.entity.Lesson;
import com.vade.application.repositery.CourseRepo;
import com.vade.application.repositery.LessonRepo;

@Service
public class TrainerServiceimp implements TrainerService{


    @Autowired
    CourseRepo cRepo;

    @Autowired
    LessonRepo lRepo;

    @Override
    public String saveCourse(Course c) {
        // TODO Auto-generated method stub
        cRepo.save(c);
        return null;
    }

    @Override
    public Course getCourse(int cid) {
        // TODO Auto-generated method stub
        Course course = cRepo.findById(cid).get();
        return course;
    }

    @Override
    public void saveLesson(Lesson l) {
        // TODO Auto-generated method stub
        lRepo.save(l);
        System.out.println("lessons added succesfully");
    }

    @Override
    public List<Course> getAllCourse() {
        // TODO Auto-generated method stub
        List<Course> getCourses = cRepo.findAll();
        return getCourses;
    }


    

    
}
