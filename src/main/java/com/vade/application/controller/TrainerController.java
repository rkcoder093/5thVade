package com.vade.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vade.application.entity.Course;
import com.vade.application.entity.Lesson;
import com.vade.application.service.TrainerService;

@Controller
public class TrainerController {

    @Autowired
    TrainerService tService;

    @PostMapping("/addcourse")
    public String addCourse(@RequestParam("id") int id, @RequestParam("name") String name,
            @RequestParam("price") int price) {
        System.out.println(id + name + price);
        Course c = new Course();
        c.setCourseId(id);
        c.setCourseName(name);
        c.setCoursePrice(price);
        tService.saveCourse(c);
        return "redirect:/addc";
    }

    @PostMapping("/addlessons")
    public String addLesson(@RequestParam("cid") int cid, @RequestParam("lid") int lid,
            @RequestParam("name") String name, @RequestParam("topic") String topic, @RequestParam("link") String link) {
        System.out.println(cid + lid + name + topic + link);

        // get the course for adding lessons
        Course c = tService.getCourse(cid);
        System.out.println(c);

        // add the lessons to the database
        Lesson l = new Lesson(lid, name, topic, link, c);
        tService.saveLesson(l);
        System.out.println(l);
        // get the lessons to the data bsae to add the lessons in the course
        c.getLesson().add(l);

        // return to hte same page
        // System.out.println(c);
        return "redirect:/addl";
    }

    @GetMapping("/viewc")
    public String viewcourses(Model model) {
        List<Course> cList = tService.getAllCourse();
        System.out.println(cList);
        model.addAttribute("courseList", cList);

        return "showCourse";
    }
}
