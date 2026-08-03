package com.faizanahmed.springboot_personal;

import java.lang.annotation.Inherited;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Spring to create a database named "Student"
public class Student {

    @Id // Mark this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment IDs (1, 2, 3...)
    private Long id;
    private String name;
    private String email;

    // Boilerplate constructor for Spring
    public Student() {}

    // Getters and Setters so Spring can read/write data
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
