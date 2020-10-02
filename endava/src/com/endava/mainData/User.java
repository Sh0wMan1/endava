package com.endava.mainData;

import com.endava.methods.UserStatus;
import java.time.LocalDateTime;

public class User {

    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private UserStatus status;
    private LocalDateTime timestamp;

      public User(String firstname, String lastname, int age, String email, UserStatus status, LocalDateTime timestamp) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timestamp = timestamp;
    }

    public void showData9(){
        System.out.println();
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "    User details: {" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }
}
