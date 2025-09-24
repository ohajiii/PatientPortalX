package com.patientportalx.backend.infrastructure.mapper;

import com.patientportalx.backend.domain.model.User;
import com.patientportalx.backend.infrastructure.entity.UserEntity;

public class UserEntityMapper {

    public static UserEntity toEntity(User user) {
        return UserEntity.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .username(user.getUsername())
                .passwordHash(user.getPasswordHash())
                .role(user.getRole())
                .createdAt(user.getCreatedAt())
                .build();
    }

    public static User toDomain(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .email(userEntity.getEmail())
                .username(userEntity.getUsername())
                .passwordHash(userEntity.getPasswordHash())
                .role(userEntity.getRole())
                .createdAt(userEntity.getCreatedAt())
                .build();
    }
}