package com.vade.application.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vade.application.entity.Course;

public interface StudentRepositery extends JpaRepository<Course, Integer>{
    
}
