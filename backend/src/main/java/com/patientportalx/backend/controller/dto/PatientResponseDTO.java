package com.patientportalx.backend.controller.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientResponseDTO {
    private Long id;
    private String gender;
    private String bloodType;
    private String dateOfBirth;
    private Integer age;
}
