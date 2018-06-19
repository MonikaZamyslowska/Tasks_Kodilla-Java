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
    public void testCalculateStatistiscCaseThousendpost() {
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
        Assert.assertEquals(10/100, commentsPerPost, 0.1);
        Assert.assertEquals(2, commentsPerUser, 0.1);
        Assert.assertEquals(1000/5, postPerUser, 0.001);

    }


}

