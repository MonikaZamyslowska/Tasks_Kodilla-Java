package com.kodilla.spring.portfolio;

import org.junit.Assert;
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
        toDoList.tasks.add("Cook lunch!");
        //When
        String getToDoList = toDoList.getTasks().get(0);
        //Then
        Assert.assertEquals(getToDoList, "Cook lunch!");
    }

    @Test
    public void TestCreateInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList inProgressList = board.getInProgressList();
        inProgressList.tasks.add("Go to the pool!");
        //When
        String getInProgressList = inProgressList.getTasks().get(0);
        //Then
        Assert.assertEquals(getInProgressList, "Go to the pool!");
    }

    @Test
    public void TestCreateDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList doneList = board.getDoneList();
        doneList.tasks.add("Do homework.");
        //When
        String getDoneList = doneList.getTasks().get(0);
        //Then
        Assert.assertEquals(getDoneList, "Do homework.");
    }
}
