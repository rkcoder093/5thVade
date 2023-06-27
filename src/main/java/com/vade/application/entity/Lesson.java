package com.vade.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Lesson {
    @Id
    int lessonId;
    String lessonName;
    String lessonTopics;
    String lessonLink;

    @ManyToOne
    Course course;

    public Lesson(int lessonId, String lessonName, String lessonTopics, String lessonLink, Course course) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.lessonTopics = lessonTopics;
        this.lessonLink = lessonLink;
        this.course = course;
    }

    public int getLessonId() {
        return this.lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return this.lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonTopics() {
        return this.lessonTopics;
    }

    public void setLessonTopics(String lessonTopics) {
        this.lessonTopics = lessonTopics;
    }

    public String getLessonLink() {
        return this.lessonLink;
    }

    public void setLessonLink(String lessonLink) {
        this.lessonLink = lessonLink;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    

    public Lesson() {
    }

    @Override
    public String toString() {
        return "{" +
            " lessonId='" + getLessonId() + "'" +
            ", lessonName='" + getLessonName() + "'" +
            ", lessonTopics='" + getLessonTopics() + "'" +
            ", lessonLink='" + getLessonLink() + "'" +
            ", course='" + getCourse() + "'" +
            "}";
    }
    
}
