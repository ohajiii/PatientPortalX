package com.patientportalx.backend.controller.mapper;

import com.patientportalx.backend.controller.dto.PatientRequestDTO;
import com.patientportalx.backend.controller.dto.PatientResponseDTO;
import com.patientportalx.backend.domain.enums.BloodType;
import com.patientportalx.backend.domain.model.Patient;

import java.time.LocalDate;

public class PatientControllerMapper {

    public static Patient toDomain(PatientRequestDTO dto) {
        return Patient.builder()
                .id(null) // id is generated later
                .dateOfBirth(LocalDate.parse(dto.getDateOfBirth()))
                .gender(dto.getGender())
                .bloodType(BloodType.valueOf(dto.getBloodType()))
                .build();
    }

    public static PatientResponseDTO toDto(Patient patient) {
        return new PatientResponseDTO(
                patient.getId(),
                patient.getGender(),
                patient.getBloodType().name(),
                patient.getDateOfBirth().toString(),
                patient.calculateAge()
        );
    }
}