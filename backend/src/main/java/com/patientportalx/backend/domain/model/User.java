package com.patientportalx.backend.domain.model;

import com.patientportalx.backend.domain.enums.Role;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class User {
    private final Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String passwordHash;
    private Role role;
    private final LocalDate createdAt;

    public User(Long id, String  firstName, String lastName, String email, String username, String passwordHash, Role role, LocalDate createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = role;
        this.createdAt = createdAt;
    }

    public void updateEmail(String newEmail){
        if (newEmail == null || !newEmail.contains("@")){
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = newEmail;
    }

    public void updateName(String firstName, String lastName){
        if (firstName == null || firstName.isBlank() || lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updatePassword(String newPasswordHash){
        if (newPasswordHash == null || newPasswordHash.isBlank()){
            throw new  IllegalArgumentException("Password hash cannot be null or empty");
        }
        this.passwordHash = newPasswordHash;
    }

    public boolean isStaff(){
        return this.role == Role.STAFF;
    }

    public boolean isPatient(){
        return this.role == Role.PATIENT;
    }

    public boolean isAdmin(){
        return this.role == Role.ADMIN;
    }
}
