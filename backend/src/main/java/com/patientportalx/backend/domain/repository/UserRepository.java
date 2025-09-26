package com.patientportalx.backend.domain.repository;

import com.patientportalx.backend.domain.enums.Role;
import com.patientportalx.backend.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    List<User> findByRole(Role role);
    User save(User user);
}
