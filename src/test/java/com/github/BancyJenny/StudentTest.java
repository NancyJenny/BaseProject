package com.github.BancyJenny;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void studentId() throws Exception {
    Student s = new Student();
        int y = s.StudentId(20);
        System.out.print(y);
    }

}
