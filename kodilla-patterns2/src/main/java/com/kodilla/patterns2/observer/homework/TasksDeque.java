package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksDeque implements Observable {
    private final List<Observer> observers;
    private final Deque<StudentTask> taskDeque;

    public TasksDeque() {
        observers = new ArrayList<>();
        taskDeque = new ArrayDeque<>();
    }

    public void addTaskToDeque(StudentTask studentTask) {
        taskDeque.offerLast(studentTask);
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

    public Deque<StudentTask> getTaskDeque() {
        return taskDeque;
    }
}
