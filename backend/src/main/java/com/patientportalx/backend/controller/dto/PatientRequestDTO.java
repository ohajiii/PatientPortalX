package com.patientportalx.backend.controller.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientRequestDTO {
    private String gender;
    private String bloodType;
    private String dateOfBirth;
}
