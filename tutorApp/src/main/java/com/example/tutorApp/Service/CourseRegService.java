package com.example.tutorApp.Service;

import com.example.tutorApp.Dto.courseDto;
import com.example.tutorApp.Entity.CourseRegister;
import com.example.tutorApp.Repository.CourseRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseRegService {

    @Autowired
    CourseRegRepository courseRegRepository;

    public ResponseEntity<String> register(String name, String email, String courseName) {
        CourseRegister addcourse = new CourseRegister(name, email, courseName);
        courseRegRepository.save(addcourse);
        return ResponseEntity.ok().body("Register successfully");
    }

    public List<courseDto> enrolledStds() {
        List<CourseRegister> list = courseRegRepository.findAll();
        return list.stream()
                .map(course -> new courseDto(course.getId(),course.getName(), course.getCourseName()))
                .collect(Collectors.toList());
    }


    public ResponseEntity<String> update(String name, String email, String courseName) {
    CourseRegister existing = courseRegRepository.findByEmail(email);
    if(existing == null){
        return ResponseEntity.badRequest().body("its not available create one in new");

    }
    existing.setName(name);
    existing.setCourseName(courseName);

    courseRegRepository.save(existing);
    return ResponseEntity.ok().body("updated successfully");


    }


    public ResponseEntity<String> delete(long id) {
        Optional<CourseRegister> courseOpt = courseRegRepository.findById(id);

        if (courseOpt.isPresent()) {
            courseRegRepository.deleteById(id);
            return ResponseEntity.ok("Deleted successfully");
        } else {
            return ResponseEntity.badRequest().body("Course with given ID not found");
        }
    }



    }

