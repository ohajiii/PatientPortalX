package com.patientportalx.backend.domain.repository;

import com.patientportalx.backend.domain.model.Intake;
import com.patientportalx.backend.domain.model.Patient;

import java.util.List;
import java.util.Optional;

public interface IntakeRepository {
    Optional<Intake> findById(Long id);
    List<Intake> findAll();
    Intake save(Intake intake, Patient patient);
}