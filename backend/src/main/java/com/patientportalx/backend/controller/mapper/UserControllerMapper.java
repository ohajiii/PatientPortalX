package com.patientportalx.backend.controller.mapper;

import com.patientportalx.backend.controller.dto.RegisterUserDTO;
import com.patientportalx.backend.controller.dto.LoginRequestDTO;
import com.patientportalx.backend.controller.dto.UserDTO;
import com.patientportalx.backend.domain.enums.Role;
import com.patientportalx.backend.domain.model.User;

import java.time.LocalDateTime;

public class UserControllerMapper {

    public static User registrationToDomain(RegisterUserDTO registerUserDTO) {
        return User.builder()
                .id(null)
                .firstName(registerUserDTO.getFirstName())
                .lastName(registerUserDTO.getLastName())
                .email(registerUserDTO.getEmail())
                .username(registerUserDTO.getUsername())
                .passwordHash(registerUserDTO.getPassword())
                .role(Role.PATIENT)
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static User loginToDomain(LoginRequestDTO loginRequestDTO) {
        return User.builder()
                .id(null)
                .email(loginRequestDTO.getEmail())
                .username(loginRequestDTO.getUsername())
                .passwordHash(loginRequestDTO.getPassword())
                .build();
    }

    public static UserDTO userToDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getUsername(),
                user.getRole()
        );
    }
}
