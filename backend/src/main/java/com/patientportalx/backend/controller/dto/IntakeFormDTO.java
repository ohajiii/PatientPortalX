package com.patientportalx.backend.controller.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IntakeFormDTO {
    @Setter(AccessLevel.NONE)
    private Long id;
    private Long caseId;
    private Integer age;
    private String gender;
    private String race;
    private String bloodType;
    private String symptoms;
    @Setter(AccessLevel.NONE)
    private LocalDateTime submittedAt;
}