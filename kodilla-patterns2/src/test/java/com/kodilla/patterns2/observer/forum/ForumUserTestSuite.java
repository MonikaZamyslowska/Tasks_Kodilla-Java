package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        ForumUser walterWhite = new ForumUser("Walter White");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        javaHelpForum.registerObserver(jessiePinkman);
        javaHelpForum.registerObserver(walterWhite);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone!");
        javaHelpForum.addPost("O hay :)");
        javaHelpForum.addPost("I need help...");
        javaToolsForum.addPost("Hello!");
        javaToolsForum.addPost("Welcome to ours forum :)");
        //Then
        assertEquals(5, jessiePinkman.getUpdateCount());
        assertEquals(3, walterWhite.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
    }
}
