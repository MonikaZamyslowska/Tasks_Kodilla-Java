package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String name;
    private final String surname;

    public ForumUser(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
