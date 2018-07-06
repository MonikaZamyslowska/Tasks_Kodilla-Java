package com.kodilla.good.patterns.food.company;

import java.util.Objects;

public class Customer {
    private String name;
    private String lastName;
    private String address;
    private int telNumber;

    public Customer(String name, String lastName, String address, int telNumber) {
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
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getTelNumber() == customer.getTelNumber() &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getLastName(), customer.getLastName()) &&
                Objects.equals(getAddress(), customer.getAddress());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getLastName(), getAddress(), getTelNumber());
    }
}
