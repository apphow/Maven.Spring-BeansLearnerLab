package com.example.demo.Config;

import com.example.demo.models.Student;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {
    ArrayList<Student> students = new ArrayList<>();

    @Bean(name = "currentStudents")
    public Students currentStudents(){

        students.add(new Student(8L, "April"));
        students.add(new Student(10L, "Cameron"));
        return new Students(students);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        students.add(new Student(20L, "January"));
        students.add(new Student(30L, "June"));

        return new Students(students);
    }
}
