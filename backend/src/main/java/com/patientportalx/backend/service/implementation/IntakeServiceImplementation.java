package com.patientportalx.backend.service.implementation;

import com.patientportalx.backend.domain.model.Intake;
import com.patientportalx.backend.domain.model.Patient;
import com.patientportalx.backend.domain.repository.IntakeRepository;
import com.patientportalx.backend.domain.repository.PatientRepository;
import com.patientportalx.backend.infrastructure.entity.IntakeEntity;
import com.patientportalx.backend.infrastructure.entity.PatientEntity;
import com.patientportalx.backend.infrastructure.mapper.IntakeEntityMapper;
import com.patientportalx.backend.infrastructure.mapper.PatientEntityMapper;
import com.patientportalx.backend.service.IntakeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IntakeServiceImplementation implements IntakeService {

    private final IntakeRepository intakeRepository;
    private final PatientRepository patientRepository;

    public IntakeServiceImplementation(IntakeRepository intakeRepository, PatientRepository patientRepository) {
        this.intakeRepository = intakeRepository;
        this.patientRepository = patientRepository;
    }

    @Override
    public Intake createIntake(Intake intake, Long patientId) {
        Optional<Patient> patientOptional = patientRepository.findById(patientId);

        if (!patientOptional.isPresent()) {
            throw new IllegalArgumentException("Patient not found with id: " + patientId);
        }

        Patient patient = patientOptional.get();

        return intakeRepository.save(intake, patient);
    }

    @Override
    public List<Intake> getAllIntakes() {
        return intakeRepository.findAll();
    }

    @Override
    public Intake getIntakeById(Long id) {
        Optional<Intake> intake = intakeRepository.findById(id);

        if (intake.isPresent()) {
            return intake.get();
        }

        throw new IllegalArgumentException("Intake not found with id: " + id);
    }
}
