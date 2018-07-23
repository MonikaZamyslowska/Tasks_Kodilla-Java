package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User andy = new Millenials("Andy");
        User lilly = new YGeneration("Lilly");
        User brad = new ZGeneration("Brad");

        //When
        String andyShould = andy.sharePost();
        System.out.println("Andy Should: " + andyShould);
        String lillyShould = lilly.sharePost();
        System.out.println("Lilly Should: " + lillyShould);
        String bradShould = brad.sharePost();
        System.out.println("Brad Should: " + bradShould);

        //Then
        Assert.assertEquals("Facebook", andyShould);
        Assert.assertEquals("Twitter", lillyShould);
        Assert.assertEquals("Snapchat", bradShould);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User andy = new Millenials("Andy");

        //When
        String andyShould = andy.sharePost();
        System.out.println("Andy Should: " + andyShould);
        andy.setSocialPublisher(new TwitterPublisher());
        String andySetShould = andy.sharePost();
        System.out.println("Andy now Should: " + andySetShould);

        //Then
        Assert.assertEquals("Twitter", andySetShould);
    }
}
