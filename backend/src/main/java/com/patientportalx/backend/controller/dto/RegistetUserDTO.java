package com.patientportalx.backend.controller.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistetUserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
}