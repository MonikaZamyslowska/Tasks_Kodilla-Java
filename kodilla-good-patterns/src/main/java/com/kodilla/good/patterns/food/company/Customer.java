package com.kodilla.good.patterns.food.company;

public class Customer {
    private String name;
    private String lastName;
    private String address;
    private int telNumber;

    public Customer(final String name, final String lastName, final String address, final int telNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getTelNumber() {
        return telNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
