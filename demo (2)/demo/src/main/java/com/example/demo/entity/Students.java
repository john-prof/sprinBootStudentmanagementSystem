package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "secondName", nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;

    public Students() {
    }

    public Students(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
