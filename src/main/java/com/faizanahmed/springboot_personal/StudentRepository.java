package com.faizanahmed.springboot_personal;

import org.springframework.data.jpa.repository.JpaRepository;

/*
This interface is where Spring does its magic, as the developer is not forced to write
complex SQL queries like **INSERT INTO student...**. The blank interface here extends
Spring's JPA repository, from where Spring automatically writes all the database logic
behind the scenes. Furthermore, in this project the database exists entirely in memory,
and is destroyed when the application is exited.

This interface gives us built-in methods like .save(), .findAll(), and .deleteById()
*/
public interface StudentRepository extends JpaRepository<Student, Long> {
}
