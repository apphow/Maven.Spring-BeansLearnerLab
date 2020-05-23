package com.example.demo.Config;

import com.example.demo.models.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    Classroom currentCohort;

    @Autowired
    Classroom previousCohort;

    @Test
    public void currentCohort() {

        Assert.assertEquals("April", currentCohort.getStudents().findById(8L).getName());
        Assert.assertEquals("Cameron", currentCohort.getStudents().findById(10L).getName());

    }

    @Test
    public void previousCohort() {
        Assert.assertEquals("January", previousCohort.getStudents().findById(20L).getName());
        Assert.assertEquals("June", previousCohort.getStudents().findById(30L).getName());

    }
}
