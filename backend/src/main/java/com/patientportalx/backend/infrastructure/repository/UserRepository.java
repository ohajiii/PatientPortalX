package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.User;
import com.patientportalx.backend.domain.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
    List<User> findByRole(Role role);
}