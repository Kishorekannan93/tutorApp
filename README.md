# 📚 TutorApp – Course Registration REST API

A Spring Boot–based REST API for managing course registrations.  
Students can register for courses, view all enrollments, update details, and delete registrations.  
Built with **Java 17**, **Spring Boot**, and **Spring Data JPA**, the project supports both **H2** (in-memory) and **MySQL** databases.

---

## ✨ Features

- **Register Student** – Enroll students into a course.
- **List Enrollments** – View all registered students with their courses.
- **Update Enrollment** – Modify student details by email.
- **Delete Enrollment** – Remove a student’s registration by ID.
- **Configurable Database** – Switch between H2 and MySQL with simple configuration.

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot** – Web, Data JPA
- **Lombok** – Reduce boilerplate code
- **H2 / MySQL** – Database
- **Maven** – Build tool

---

## 📂 Project Structure

```plaintext
src/
└── main/
    ├── java/
    │   └── com/example/tutorApp/
    │       ├── Controller/
    │       │   ├── courseController.java
    │       │   └── CourseRegController.java
    │       ├── Dto/
    │       │   └── courseDto.java
    │       ├── Entity/
    │       │   ├── Course.java
    │       │   └── CourseRegister.java
    │       ├── Repository/
    │       │   ├── CourseRegRepository.java
    │       │   └── CourseRepository.java
    │       ├── Service/
    │       │   ├── CourseRegService.java
    │       │   └── CourseService.java
    │       └── TutorAppApplication.java
    └── resources/
        └── application.properties





