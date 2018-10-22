package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    final private String peselId;
    final private String name;
    final private String lastName;
    final BigDecimal baseSalary;

    public Employee(String peselId, String name, String lastName, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.name = name;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getPeselId(), employee.getPeselId()) &&
                Objects.equals(getName(), employee.getName()) &&
                Objects.equals(getLastName(), employee.getLastName()) &&
                Objects.equals(getBaseSalary(), employee.getBaseSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPeselId(), getName(), getLastName(), getBaseSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
