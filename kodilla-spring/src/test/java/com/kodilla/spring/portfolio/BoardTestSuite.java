package com.kodilla.spring.portfolio;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void TestCreateListToDo() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList toDoList = board.getToDoList();
        //When
        toDoList.tasks.add("Cook lunch!");
        String getToDoList = toDoList.getTasks().get(0);
        //Then
        System.out.println("To do list: " + getToDoList);
    }

    @Test
    public void TestCreateInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList inProgressList = board.getInProgressList();
        //When
        inProgressList.tasks.add("Go to the pool!");
        String getInProgressList = inProgressList.getTasks().get(0);
        //Then
        System.out.println("In progress List: " + getInProgressList);
    }

    @Test
    public void TestCreateDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList doneList = board.getDoneList();
        //When
        doneList.tasks.add("Do homework.");
        String getDoneList = doneList.getTasks().get(0);
        //Then
        System.out.println("Done list: " + getDoneList);
    }
}
