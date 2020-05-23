package com.example.demo.models;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

        int numberOfLearners = 0;
        for(Learner learner : learners) {
            numberOfLearners++;
        }
        for(Learner each : learners) {
            each.learn(numberOfHours/numberOfLearners);
        }
    }
}
