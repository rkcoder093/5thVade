package com.vade.application.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vade.application.entity.Lesson;

public interface LessonRepo extends JpaRepository<Lesson, Integer>{
    
}
