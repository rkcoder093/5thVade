package com.vade.application.service;

import java.util.List;

import com.vade.application.entity.Course;
import com.vade.application.entity.Lesson;

public interface TrainerService {

    String saveCourse(Course c);

    Course getCourse(int cid);

    void saveLesson(Lesson l);

    List<Course> getAllCourse();


}
