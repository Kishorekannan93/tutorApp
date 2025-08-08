package com.example.tutorApp.Controller;

import com.example.tutorApp.Dto.courseDto;
import com.example.tutorApp.Entity.CourseRegister;
import com.example.tutorApp.Service.CourseRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseRegController {

    @Autowired
    CourseRegService courseRegService;

    @PostMapping("/register")
    public ResponseEntity<String> courseRegister(@RequestBody CourseRegister courseRegister) {
        return courseRegService.register(
                courseRegister.getName(),
                courseRegister.getEmail(),
                courseRegister.getCourseName()
        );
    }

    @GetMapping("/enrolled")
    public List<courseDto> enrolledStudents(){
        return courseRegService.enrolledStds();
    }

    @PutMapping("/update")
    public ResponseEntity<String> courseUpdate(@RequestBody CourseRegister courseRegister) {
        return courseRegService.update(
                courseRegister.getName(),
                courseRegister.getEmail(),
                courseRegister.getCourseName()
        );
    }

    @DeleteMapping("/course")
    public ResponseEntity<String> delete(@RequestParam long id) {
        return courseRegService.delete(id);
    }
}
