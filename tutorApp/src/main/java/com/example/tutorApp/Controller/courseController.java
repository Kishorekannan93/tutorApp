package com.example.tutorApp.Controller;
import com.example.tutorApp.Entity.Course;
import com.example.tutorApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class courseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    public List<Course> allCourse(){
        return courseService.allCourse();

    }
}
