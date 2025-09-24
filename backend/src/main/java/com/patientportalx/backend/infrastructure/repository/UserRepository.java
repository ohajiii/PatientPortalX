package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.UserEntity;
import com.patientportalx.backend.domain.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByUsername(String username);
    List<UserEntity> findByRole(Role role);
}