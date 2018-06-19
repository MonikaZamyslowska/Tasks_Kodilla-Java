package com.kodilla.testing.forum.statistic;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTest {
    // Test #1
    @Test
    public void testCalculateStatisticsCaseZeroPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> theList = new ArrayList<>();
        theList.add("Monika");
        theList.add("Oliwia");
        theList.add("Wiktoria");
        theList.add("Mateusz");
        theList.add("Adrian");

        when(statisticsMock.userNames()).thenReturn(theList);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double postPerUser = calculateStatistics.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(0, commentsPerPost, 0.1);
        Assert.assertEquals(0, commentsPerUser, 0.1);
        Assert.assertEquals(0, postPerUser, 0.1);
    }
    // Test #2
    @Test
    public void testCalculateStatisticsCaseThousandPost() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> theList = new ArrayList<>();
        theList.add("Monika");
        theList.add("Oliwia");
        theList.add("Wiktoria");
        theList.add("Mateusz");
        theList.add("Adrian");

        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double postPerUser = calculateStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals((double)10/100, commentsPerPost, 0.1);
        Assert.assertEquals(10/5, commentsPerUser, 0.1);
        Assert.assertEquals(1000/5, postPerUser, 0.1);

    }
    // Test #3
    @Test
    public void testCalculateStatisticsCaseCommentsEqualsZero() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> theList = new ArrayList<>();
        theList.add("Monika");
        theList.add("Oliwia");
        theList.add("Wiktoria");
        theList.add("Mateusz");
        theList.add("Adrian");

        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(0);
        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double postPerUser = calculateStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(0/20, commentsPerPost, 0.1);
        Assert.assertEquals(0/5, commentsPerUser, 0.1);
        Assert.assertEquals(20/5, postPerUser, 0.1);
    }
    // Test #4
    @Test
    public void testCalculateStatisticsCaseCommentsSmallerThanPost() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> theList = new ArrayList<>();
        theList.add("Monika");
        theList.add("Oliwia");
        theList.add("Wiktoria");
        theList.add("Mateusz");
        theList.add("Adrian");

        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(57);
        when(statisticsMock.commentsCount()).thenReturn(14);
        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double postPerUser = calculateStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals((double)14/57, commentsPerPost, 0.1);
        Assert.assertEquals((double)14/5, commentsPerUser, 0.1);
        Assert.assertEquals((double)57/5, postPerUser, 0.1);

    }
    // Test #5
    @Test
    public void testCalculateStatisticsCaseCommentsBiggerThanPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> theList = new ArrayList<>();
        theList.add("Monika");
        theList.add("Oliwia");
        theList.add("Wiktoria");
        theList.add("Mateusz");
        theList.add("Adrian");

        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(60);
        when(statisticsMock.commentsCount()).thenReturn(120);
        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double postPerUser = calculateStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(120/60, commentsPerPost, 0.1);
        Assert.assertEquals(120/5, commentsPerUser, 0.1);
        Assert.assertEquals(60/5, postPerUser, 0.1);

    }
    // Test #6
    @Test
    public void testCalculateStatisticsCaseUsersZero() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> theList = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(60);
        when(statisticsMock.commentsCount()).thenReturn(120);
        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double postPerUser = calculateStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(120/60, commentsPerPost, 0.1);
        Assert.assertEquals(0, commentsPerUser, 0.1);
        Assert.assertEquals(0, postPerUser, 0.1);

    }
    // Test #7
    @Test
    public void testCalculateStatisticsCaseUsersOneHundred() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> theList = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            theList.add("name");
        }

        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(60);
        when(statisticsMock.commentsCount()).thenReturn(120);
        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double postPerUser = calculateStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(120/60, commentsPerPost, 0.1);
        Assert.assertEquals((double)120/100, commentsPerUser, 0.1);
        Assert.assertEquals((double)60/100, postPerUser, 0.1);
    }
}

