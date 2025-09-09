package com.school;

public class Course {
    private static int nextCourseIdCounter = 101; // auto-ID generator
    private int courseId;
    private String courseName;

    // Constructor
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Course Name: " + this.courseName);
    }
}
