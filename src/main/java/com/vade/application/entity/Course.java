package com.vade.application.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Objects;

@Entity
public class Course {
    @Id
    int courseId;
    String courseName;
    int coursePrice;
    @OneToMany
    List<Lesson> lesson;

    public Course() {
    }

    public Course(int courseId, String courseName, int coursePrice, List<Lesson> lesson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.lesson = lesson;
    }
    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCoursePrice() {
        return this.coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public List<Lesson> getLesson() {
        return this.lesson;
    }

    public void setLesson(List<Lesson> lesson) {
        this.lesson = lesson;
    }
    @Override
    public String toString() {
        return "{" +
            " courseId='" + getCourseId() + "'" +
            ", courseName='" + getCourseName() + "'" +
            ", coursePrice='" + getCoursePrice() + "'" +
            ", lesson='" + getLesson() + "'" +
            "}";
    }

    
}
