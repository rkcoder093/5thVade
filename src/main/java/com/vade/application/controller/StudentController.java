package com.vade.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vade.application.entity.Course;
import com.vade.application.service.StudetnService;

@Controller
public class StudentController {

    @Autowired
    StudetnService sService;
    
    @GetMapping("/buycourse")
    public String buyCourse(Model model){
        List<Course> cList = sService.getCourses();
        model.addAttribute("courseList", cList);
        return "buycourse";
    }
}
