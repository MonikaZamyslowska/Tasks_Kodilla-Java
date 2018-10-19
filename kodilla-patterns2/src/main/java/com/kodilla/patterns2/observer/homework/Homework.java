package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Homework implements Observable{
    private final List<Observer> observers;
    private final Deque<String> tasksList;
    private final String student;

    public Homework(String student) {
        observers = new ArrayList<>();
        tasksList = new ArrayDeque<>();
        this.student = student;
    }

    public void addHomework (String moduleInfo) {
        String homeworkBuilder = moduleInfo + " [" + student + "]";
        tasksList.offerLast(homeworkBuilder);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getModuleList() {
        return tasksList;
    }

    public String getStudent() {
        return student;
    }
}
