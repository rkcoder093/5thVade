package com.vade.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vade.application.entity.Comments;
import com.vade.application.repositery.CommentReposetory;

@Service
public class CommentServiceImp implements CommentService{

    @Autowired
    CommentReposetory cRepo;

    @Override
    public List<Comments> commentList() {
        // TODO Auto-generated method stub
        return cRepo.findAll();
    }

    @Override
    public void saveComment(Comments c) {
        // TODO Auto-generated method stub
        cRepo.save(c);
    }
    
}
