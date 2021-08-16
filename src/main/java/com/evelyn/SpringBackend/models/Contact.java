package com.evelyn.SpringBackend.models;
import javax.persistence.*;
 
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(name = "email", nullable = false, length = 45)
    private String email;
     
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "subject", nullable = false, length = 1000)
    private String subject;
     
    @Column(name = "message", nullable = false, length = 10000)
    private String message;

    public Contact() {

    }

    public Contact(String name, String email, String subject, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
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
    
}
