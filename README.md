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
test/
📜 API Documentation
Each endpoint includes: method, URL, headers, request body example, and response example.

1. Register a Student
Method: POST
Endpoint: /register

Headers:

pgsql
Copy
Edit
Content-Type: application/json
Request Body Example:

json
Copy
Edit
{
  "name": "John Doe",
  "email": "john@example.com",
  "courseName": "Spring Boot Basics"
}
Response Example:

json
Copy
Edit
{
  "message": "Student registered successfully"
}
2. List All Enrolled Students
Method: GET
Endpoint: /enrolled

Response Example:

json
Copy
Edit
[
  {
    "name": "John Doe",
    "courseName": "Spring Boot Basics"
  },
  {
    "name": "Jane Smith",
    "courseName": "Java Advanced"
  }
]
3. Update Student Details
Method: PUT
Endpoint: /update

Headers:

pgsql
Copy
Edit
Content-Type: application/json
Request Body Example:

json
Copy
Edit
{
  "name": "John Doe Updated",
  "email": "john@example.com",
  "courseName": "Spring Boot Advanced"
}
Response Example:

json
Copy
Edit
{
  "message": "Student details updated successfully"
}
4. Delete Registration by ID
Method: DELETE
Endpoint: /course?id={id}

Example Request:

bash
Copy
Edit
DELETE /course?id=1
Response Example:

json
Copy
Edit
{
  "message": "Student registration deleted successfully"
}
🚀 How to Run the Project
Clone the Repository

bash
Copy
Edit
git clone https://github.com/<your-username>/tutorapp.git
cd tutorapp
Configure the Database
By default, the project uses H2 in-memory DB.
To switch to MySQL, update src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/tutorapp
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build & Run

bash
Copy
Edit
mvn clean install
mvn spring-boot:run
Test Endpoints in Postman

Always set:

pgsql
Copy
Edit
Content-Type: application/json
Use the sample requests provided above.

📝 Notes
H2 Console Access:

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

Postman:

POST & PUT → Must have Content-Type: application/json header.

GET → No body required.

DELETE → Send id as query parameter.

👨‍💻 Author
[Kishore Kannan H](https://kishorekannan93.github.io/portfolio./)
Java Developer | Full-Stack Enthusiast | DSA Learner
[GitHub Profile](https://github.com/Kishorekannan93) | [LinkedIn](https://www.linkedin.com/in/kishore-kannan-h-47924b296?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3Bi6lnffIPREeerIaq%2ByzNRw%3D%3D)
