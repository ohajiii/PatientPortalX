package com.patientportalx.backend.controller.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {
    @Setter(AccessLevel.NONE)
    private Long id;
    private Long patientId;
    private Long staffId;
    private String message;
    @Setter(AccessLevel.NONE)
    private LocalDateTime sentAt;
}