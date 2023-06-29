package com.vade.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int commentId;
    String comment;


    public int getCommentId() {
        return this.commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comments() {
    }

    public Comments(int commentId, String comment) {
        this.commentId = commentId;
        this.comment = comment;
    }


    @Override
    public String toString() {
        return "{" +
            " commentId='" + getCommentId() + "'" +
            ", comment='" + getComment() + "'" +
            "}";
    }

}
