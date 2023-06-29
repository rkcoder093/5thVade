package com.vade.application.service;

import java.util.List;

import com.vade.application.entity.Course;
import com.vade.application.entity.Lesson;

public interface StudetnService {

    List<Course> getCourses();

    Lesson getLesson(int id);
    
}
