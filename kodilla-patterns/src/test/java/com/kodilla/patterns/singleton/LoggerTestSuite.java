package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void logTest() {
        Logger.getLoggerInstance().log("log123");
    }

    @Test
    public void getLastLogTest() {
        //Given
        //When
        String log = Logger.getLoggerInstance().getLastLog();
        System.out.println("Last log: " + log);
        //Then
        Assert.assertEquals("log123", log);
    }
}
