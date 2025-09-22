package com.patientportalx.backend.repository;

import com.patientportalx.backend.entity.CaseEntity;
import com.patientportalx.backend.entity.IntakeForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntakeFormRepository extends JpaRepository<IntakeForm, Long> {
}