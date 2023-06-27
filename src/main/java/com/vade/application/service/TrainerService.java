package com.vade.application.service;

import com.vade.application.entity.Course;
import com.vade.application.entity.Lesson;

public interface TrainerService {

    String saveCourse(Course c);

    Course getCourse(int cid);

    void saveLesson(Lesson l);

}
