package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }


    @Override
    public void update(Homework homework) {
        System.out.println("Hello " + mentorName + ". You have a [" + homework.getModuleList().size() +
                "] new homework on wall. \n" + "First homework in list is: " + homework.getModuleList().peekLast());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
