package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static String LISTNAME = "Olga, Maria, Diana, Oliwia";
    private static String DESCRIPTION = "Description";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String getListName = taskList.getListName();

        //When
        List<TaskList> readListName = taskListDao.findByListName(getListName);

        //Then
        Assert.assertEquals(1, readListName.size());

        //CleanUp
        int id = taskList.getId();
        taskListDao.delete(id);
    }
}
