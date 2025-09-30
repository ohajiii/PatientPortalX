package com.patientportalx.backend.domain.model;

import com.patientportalx.backend.domain.enums.BloodType;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Builder
public class Patient {
    private final Long id;
    private final LocalDate dateOfBirth;
    private String gender;
    private BloodType bloodType;

    public Patient(Long id, LocalDate dateOfBirth, String gender, BloodType bloodType) {
        if(dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Invalid date of birth");
        }
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        updateGender(gender);
        updateBloodType(bloodType);
    }

    public void updateGender(String newGender) {
        if(newGender == null || newGender.isBlank()) {
            throw new IllegalArgumentException("Gender cannot be null or empty");
        }
        this.gender = newGender;
    }

    public void updateBloodType(BloodType newBloodType) {
        if(newBloodType == null) {
            throw new IllegalArgumentException("Blood type cannot be null");
        }
        this.bloodType = newBloodType;
    }

    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}