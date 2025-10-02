package com.patientportalx.backend.domain.repository;

import com.patientportalx.backend.domain.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    Optional<Patient> findById(Long id);
    List<Patient> findAllPatients();
    Patient save(Patient patient);
}
