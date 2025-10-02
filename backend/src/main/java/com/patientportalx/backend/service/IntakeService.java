package com.patientportalx.backend.service;

import com.patientportalx.backend.domain.model.Intake;

import java.util.List;

public interface IntakeService {
    Intake createIntake(Intake intake, Long patientId);
    List<Intake> getAllIntakes();
    Intake getIntakeById(Long id);
}