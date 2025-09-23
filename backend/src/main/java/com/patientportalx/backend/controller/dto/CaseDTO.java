package com.patientportalx.backend.controller.dto;

import com.patientportalx.backend.domain.enums.CaseStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CaseDTO {
    @Setter(AccessLevel.NONE)
    private Long id;
    private Long patientId;
    private Long staffId;
    private CaseStatus status;
    @Setter(AccessLevel.NONE)
    private LocalDateTime createdAt;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedAt;
}