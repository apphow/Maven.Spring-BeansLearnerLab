package com.example.demo.Config;

import com.example.demo.models.Classroom;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Bean(name="currentCohort")
    public Classroom currentCohort(Instructors instructors, Students currentStudents) {

        return new Classroom(instructors, currentStudents);
    }

    @Bean(name = "previousCohort")
    public Classroom previousCohort(Instructors instructors, Students previousStudents) {

        return new Classroom(instructors, previousStudents);
    }
}
