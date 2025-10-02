package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientJpaRepository extends JpaRepository<PatientEntity, Long> {
}
