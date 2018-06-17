package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.*;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");

        //When
        forumUser.addPost(forumUser.getName(),
                "Hello everyone, this is my first contribution here!");

        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", forumUser.getName());

        //When
        forumUser.addComment(thePost, forumUser.getName(), "Thank you for all good words!");

        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", forumUser.getName());
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", forumUser.getName());
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!",
                forumUser.getName());
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", forumUser.getName());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", forumUser.getName());
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!",
                forumUser.getName());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", forumUser.getName());
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("pinki", "Jessy Pinkman");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", forumUser.getName());
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!",
                forumUser.getName());
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }


}
