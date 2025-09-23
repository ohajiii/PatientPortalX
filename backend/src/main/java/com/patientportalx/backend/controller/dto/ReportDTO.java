package com.patientportalx.backend.controller.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportDTO {
    @Setter(AccessLevel.NONE)
    private Long id;
    private Long caseId;
    private String noteType;
    private String reportText;
    private String content;
    @Setter(AccessLevel.NONE)
    private LocalDateTime createdAt;
}