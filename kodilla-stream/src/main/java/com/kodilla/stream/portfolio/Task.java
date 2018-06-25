package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {
    private final String title;
    private final String descriptions;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(String title, String descriptions, User assignedUser, User creator, LocalDate created, LocalDate deadline) {
        this.title = title;
        this.descriptions = descriptions;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}';
    }
}
