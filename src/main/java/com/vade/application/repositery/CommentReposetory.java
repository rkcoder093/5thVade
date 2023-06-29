package com.vade.application.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vade.application.entity.Comments;

public interface CommentReposetory  extends JpaRepository<Comments,Integer>{
    
}
