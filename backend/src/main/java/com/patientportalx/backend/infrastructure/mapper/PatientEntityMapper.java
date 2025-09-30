package com.patientportalx.backend.infrastructure.mapper;

import com.patientportalx.backend.domain.model.Patient;
import com.patientportalx.backend.infrastructure.entity.PatientEntity;

public class PatientEntityMapper {

    public static PatientEntity toEntity(Patient patient) {
        return PatientEntity.builder()
                .id(patient.getId())
                .dateOfBirth(patient.getDateOfBirth())
                .gender(patient.getGender())
                .bloodType(patient.getBloodType())
                .build();
    }

    public static Patient toDomain(PatientEntity entity) {
        return Patient.builder()
                .id(entity.getId())
                .dateOfBirth(entity.getDateOfBirth())
                .gender(entity.getGender())
                .bloodType(entity.getBloodType())
                .build();
    }
}