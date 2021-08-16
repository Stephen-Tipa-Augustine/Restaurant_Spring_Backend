package com.evelyn.SpringBackend.models;

import javax.persistence.*;
 
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(name = "name", nullable = false, length = 200)
    private String name;
     
    @Column(name = "email", nullable = false, length = 100)
    private String email;
     
    @Column(name = "phone", nullable = false, length = 100)
    private String phone;

    @Column(name = "date", nullable = false, length = 100)
    private String date;

    @Column(name = "time", nullable = false, length = 100)
    private String time;

    @Column(name = "people", nullable = false, length = 10)
    private Integer people;

    @Column(name = "message", nullable = false, length = 10000)
    private String message;

    public Booking() {

    }

    public Booking(String name, String email, String phone, String date, String time, Integer people, String message) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.people = people;
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public Integer getPeople() {
        return people;
    }

    public String getPhone() {
        return phone;
    }

    public String getTime() {
        return time;
    }
    
}
