package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observer{
    private final String mentorName;
    private int updateCount;

    public Teacher(String mentorName) {
        this.mentorName = mentorName;
    }


    @Override
    public void update(TasksDeque tasksDeque) {
        System.out.println("Hello " + mentorName + ". You have a [" + tasksDeque.getTaskDeque().size() +
                "] new homework on wall. \n" + "First homework in list is: " +
                tasksDeque.getTaskDeque().peekFirst().toString());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
