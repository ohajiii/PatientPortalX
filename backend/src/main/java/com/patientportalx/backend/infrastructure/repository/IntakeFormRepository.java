package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.IntakeForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntakeFormRepository extends JpaRepository<IntakeForm, Long> {
}