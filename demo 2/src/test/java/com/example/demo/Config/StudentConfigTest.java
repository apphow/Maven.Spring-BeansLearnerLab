package com.example.demo.Config;

import com.example.demo.models.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    Students currentStudents;

    @Autowired
    Students previousStudents;

    @Test
    public void currentStudents() {
        Assert.assertEquals("April", currentStudents.findById(8L).getName());
        Assert.assertEquals("Cameron", currentStudents.findById(10L).getName());
    }

    @Test
    public void previousStudents() {
        Assert.assertEquals("April", previousStudents.findById(8L).getName());
        Assert.assertEquals("Cameron", previousStudents.findById(10L).getName());
    }
}
