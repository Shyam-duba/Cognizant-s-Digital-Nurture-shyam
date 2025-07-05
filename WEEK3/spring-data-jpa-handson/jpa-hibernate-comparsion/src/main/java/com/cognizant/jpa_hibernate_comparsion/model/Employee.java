package com.cognizant.jpa_hibernate_comparsion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
@Access(AccessType.FIELD)
public class Employee {

    @Id
    @Column(name="id")
    private int employeeId;
    private String name;
    private double salary;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
