package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create Courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Display Students & Courses
        System.out.println("=== Students ===");
        s1.displayDetails();
        s2.displayDetails();

        System.out.println("\n=== Courses ===");
        c1.displayDetails();
        c2.displayDetails();

        // Attendance Records
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c1.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Late")); // invalid

        // Display Attendance Records
        System.out.println("\n=== Attendance Log ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
