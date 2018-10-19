package com.kodilla.patterns2.observe.homework;

import com.kodilla.patterns2.observer.homework.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTaskDequeTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student ania = new Student("Anna", "Witka", "wicia@email.com");
        Student oliwia = new Student("Oliwia", "Etna", "ecia@email.com");
        Student olaf = new Student("Olaf", "Nowak", "nowy@email.com");

        StudentTask aniaTask1 = new StudentTask(ania, "Task from module 20.1");
        StudentTask aniaTask2 = new StudentTask(ania, "Task from module 20.2");
        StudentTask oliwiaTask1 = new StudentTask(oliwia, "Task from module 3.3");
        StudentTask olafTask1 = new StudentTask(olaf, "Task from module 12.5");

        Teacher jessie = new Teacher("Jessie Pinkmnan");
        Teacher walter = new Teacher("Walter White");

        TasksDeque dequeForJessie = new TasksDeque();
        TasksDeque dequeForWalter = new TasksDeque();

        dequeForWalter.registerObserver(walter);
        dequeForJessie.registerObserver(jessie);
        //When
        dequeForJessie.addTaskToDeque(aniaTask1);
        dequeForJessie.addTaskToDeque(aniaTask2);
        dequeForJessie.addTaskToDeque(olafTask1);

        dequeForWalter.addTaskToDeque(oliwiaTask1);
        //Then
        assertEquals(1, walter.getUpdateCount());
        assertEquals(3, jessie.getUpdateCount());
    }
}
