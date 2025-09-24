package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.IntakeFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntakeFormRepository extends JpaRepository<IntakeFormEntity, Long> {
}