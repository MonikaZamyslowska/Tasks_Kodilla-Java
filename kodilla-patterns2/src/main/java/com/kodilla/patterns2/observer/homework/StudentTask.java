package com.kodilla.patterns2.observer.homework;

public class StudentTask{
    private Student student;
    private final String description;

    public StudentTask(Student student, String description) {
        this.student = student;
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "StudentTask {" +
                "student = " + student.toString() +
                ", description = '" + description + '\'' +
                '}';
    }
}
