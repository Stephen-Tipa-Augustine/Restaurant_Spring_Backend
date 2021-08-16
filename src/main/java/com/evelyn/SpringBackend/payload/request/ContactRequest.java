package com.evelyn.SpringBackend.payload.request;
import javax.validation.constraints.*;

public class ContactRequest {
    @NotBlank
    @Size(min = 3, max = 64)
    private String name;

    @NotBlank
    @Size(max = 45)
    @Email
    private String email;

    @NotBlank
    @Size(min = 3, max = 1000)
    private String subject;

    @NotBlank
    @Size(min = 3, max = 10000)
    private String message;
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
