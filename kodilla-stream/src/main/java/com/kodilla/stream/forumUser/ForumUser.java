package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(int userID, String username, char sex, int birthYear, int birthMonth, int birthDay, int numberOfPosts) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        this.numberOfPosts = numberOfPosts;
    }
}
