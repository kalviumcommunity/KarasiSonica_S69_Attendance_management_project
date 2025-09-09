package com.school;

public class Main {
    public static void main(String[] args) {
        // Create Students using constructors
        Student[] students = new Student[3];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");

        // Create Courses using constructors
        Course[] courses = new Course[3];
        courses[0] = new Course("Mathematics");
        courses[1] = new Course("Computer Science");
        courses[2] = new Course("Physics");

        // Display Students
        System.out.println("=== Students ===");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display Courses
        System.out.println("\n=== Courses ===");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
