package com.example.demo.Config;

import com.example.demo.models.Instructors;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {

    @Autowired
    @Qualifier(value = "tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
     @Qualifier(value = "tcUsaInstructors")
    Instructors tcUKINstructors;


    @Autowired
    @Qualifier(value = "instructors")
    Instructors instructors;

    @org.junit.Test
    public void tcUsaInstructors() {
        Assert.assertEquals("Kris", tcUsaInstructors.findById(10L).getName());
    }

    @org.junit.Test
    public void tcUKInstructors() {
        Assert.assertEquals("Dolio", tcUKINstructors.findById(8L).getName());
    }

    @org.junit.Test
    public void instructors() {
        Assert.assertEquals("Dolio", instructors.findById(8L).getName());
    }
}
