package com.patientportalx.backend.dto;

import com.patientportalx.backend.entity.enums.CaseStatus;
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