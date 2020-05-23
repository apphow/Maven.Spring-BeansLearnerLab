package com.example.demo.models;

public class Student extends Person implements Learner{

    Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public  double getTotalStudyTime() {
        return totalStudyTime;
    }


}
