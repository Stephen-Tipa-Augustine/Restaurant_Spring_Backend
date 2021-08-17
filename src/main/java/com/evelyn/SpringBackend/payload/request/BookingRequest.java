package com.evelyn.SpringBackend.payload.request;
import javax.validation.constraints.*;

public class BookingRequest {
    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank
    @Size(max = 100)
    private String email;

    @NotBlank
    @Size(max = 100)
    private String phone;

    @NotBlank
    @Size(max = 100)
    private String date;

    @NotBlank
    @Size(max = 100)
    private String time;

    @NotBlank
    @Size(max = 10)
    private String people;

    @NotBlank
    @Size(max = 10000)
    private String message;

    public void setDate(String date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(String people) {
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

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getPeople() {
        return people;
    }

    public String getPhone() {
        return phone;
    }

    public String getTime() {
        return time;
    }
    
}
