package com.vade.application.service;

import java.util.List;

import com.vade.application.entity.Comments;

public interface CommentService {
    List<Comments> commentList();

    void saveComment(Comments c);
    
}
