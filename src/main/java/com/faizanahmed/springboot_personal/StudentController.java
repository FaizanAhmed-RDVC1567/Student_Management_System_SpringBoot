package com.faizanahmed.springboot_personal;

/*
* This class will listen to incoming web browser requests and the trigger
* specific Java code in this application. The annotation called 'Autowired'
* is used here to enable Spring to pass in the database repository into this
* class (Dependency Injection)
* */

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController  // This tells Spring that this class handles web URLs
@RequestMapping("/students")  // All URLs in this class start with /students
public class StudentController {

    @Autowired  // Dependency Injection: Spring automatically provides the database connection object
    private StudentRepository studentRepository;

    @GetMapping  // Listens for HTTP GET requests to fetch data
    public List<Student> getAllStudents() {
        return studentRepository.findAll();  // Fetches all students from the database
    }

    @PostMapping  // Listens for HTTP POST requests to save new data
    public Student addStudent(@RequestBody Student student) {
        /* The RequestBody binds the student object to the body of this request in
         * the proper format. */
        return studentRepository.save(student);  // Saves the student to the database
    }
}
