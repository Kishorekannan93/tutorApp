package com.example.tutorApp.Repository;


import com.example.tutorApp.Dto.courseDto;
import com.example.tutorApp.Entity.CourseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRegRepository extends JpaRepository<CourseRegister, Long> {

    // Find all students by name and course name
    List<CourseRegister> findByNameAndCourseName(String name, String courseName);

    CourseRegister findByEmail(String email);

    List<CourseRegister> findByCourseName(String courseName);  // For delete all in that course
}

