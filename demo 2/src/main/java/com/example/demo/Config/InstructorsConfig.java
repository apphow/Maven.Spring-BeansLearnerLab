package com.example.demo.Config;

import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {
    ArrayList<Instructor> instructors = new ArrayList<>();

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        instructors.add(new Instructor(10L, "Kris"));
        instructors.add(new Instructor(8L, "Dolio"));
        instructors.add(new Instructor(3L, "Chris"));
        return new Instructors(instructors);
    }

    @Bean(name = "tcUKINstructors")
    public Instructors tcUKInstructors() {
        instructors.add(new Instructor(8L, "Dolio"));
        instructors.add(new Instructor(3L, "Chris"));
        return new Instructors(instructors);
    }
    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        instructors.add(new Instructor(8L, "Dolio"));
        instructors.add(new Instructor(3L, "Chris"));
        return new Instructors(instructors);
    }
}
