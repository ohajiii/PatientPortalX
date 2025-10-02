package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.domain.model.Intake;
import com.patientportalx.backend.infrastructure.entity.IntakeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntakeJpaRepository extends JpaRepository<IntakeEntity, Long> {
}