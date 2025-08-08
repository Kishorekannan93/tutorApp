package com.example.tutorApp.Service;

import com.example.tutorApp.Entity.Course;
import com.example.tutorApp.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> allCourse() {
        return courseRepository.findAll();
    }
}
