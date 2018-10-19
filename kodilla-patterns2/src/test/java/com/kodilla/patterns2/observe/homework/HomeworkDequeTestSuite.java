package com.kodilla.patterns2.observe.homework;

import com.kodilla.patterns2.observer.homework.*;
import org.junit.Test;
import sun.security.pkcs11.Secmod;

import static org.junit.Assert.*;

public class HomeworkDequeTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Homework homeworkFromOlga = new HomeworkFromOlga();
        Homework homeworkFromOliwia = new HomeworkFromOliwia();
        Homework homeworkFromAndrew = new HomeworkFromAndrew();
        Mentor jessie = new Mentor("Jessie Pinkmnan");
        Mentor walter = new Mentor("Walter White");
        homeworkFromAndrew.registerObserver(walter);
        homeworkFromOlga.registerObserver(jessie);
        homeworkFromOliwia.registerObserver(jessie);
        //When
        homeworkFromOlga.addHomework("Module 1.1");
        homeworkFromAndrew.addHomework("Module 15.3");
        homeworkFromOlga.addHomework("Module 1.2");
        homeworkFromOliwia.addHomework("Module 20.5");
        //Then
        assertEquals(1, walter.getUpdateCount());
        assertEquals(3, jessie.getUpdateCount());
    }
}
