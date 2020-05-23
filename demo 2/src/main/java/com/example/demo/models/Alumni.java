package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {
    Students students;
    Students previousStudents;
    Instructors instructors;

    @Autowired
    public void Students(Students previousStudents){
        this.previousStudents = previousStudents;
    }

    @Autowired
    public void Instructors(Instructors instructors) {
        this.instructors = instructors;
    }
    @PostConstruct
    public void executeBootcamp() {

        for(Student each : previousStudents) {
            each.learn(1200);
        }
    }

    public Students getStudents() {
        return students;
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
