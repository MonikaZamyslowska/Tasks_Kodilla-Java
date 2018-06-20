package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String name;
    private String lastName;
    private int peselID;

    public LibraryUser(String name, String lastName, int peselID) {
        this.name = name;
        this.lastName = lastName;
        this.peselID = peselID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPeselID() {
        return peselID;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselID=" + peselID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        return getPeselID() == that.getPeselID() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getLastName(), that.getLastName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getLastName(), getPeselID());
    }
}
