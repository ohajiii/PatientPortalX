package com.patientportalx.backend.infrastructure.repository.implementation;

import com.patientportalx.backend.domain.model.Intake;
import com.patientportalx.backend.domain.model.Patient;
import com.patientportalx.backend.domain.repository.IntakeRepository;
import com.patientportalx.backend.infrastructure.entity.IntakeEntity;
import com.patientportalx.backend.infrastructure.entity.PatientEntity;
import com.patientportalx.backend.infrastructure.mapper.IntakeEntityMapper;
import com.patientportalx.backend.infrastructure.mapper.PatientEntityMapper;
import com.patientportalx.backend.infrastructure.repository.IntakeJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class IntakeRepositoryImplementation implements IntakeRepository {

    private final IntakeJpaRepository intakeJpaRepository;

    public IntakeRepositoryImplementation(IntakeJpaRepository intakeJpaRepository) {
        this.intakeJpaRepository = intakeJpaRepository;
    }

    @Override
    public Optional<Intake> findById(Long id) {
        Optional<IntakeEntity> result = intakeJpaRepository.findById(id);

        if(result.isPresent()) {
            IntakeEntity entity = result.get();
            Intake intake = IntakeEntityMapper.toDomain(entity);
            return Optional.of(intake);
        }

        return Optional.empty();
    }

    @Override
    public List<Intake> findAll() {
        List<IntakeEntity> entities = intakeJpaRepository.findAll();
        List<Intake> intakes = new ArrayList<>();

        for (IntakeEntity entity : entities) {
            Intake intake = IntakeEntityMapper.toDomain(entity);
            intakes.add(intake);
        }

        return intakes;
    }

    @Override
    public Intake save(Intake intake, Patient patient) {
        IntakeEntity entity = IntakeEntityMapper.toEntity(intake);
        PatientEntity patientEntity = PatientEntityMapper.toEntity(patient);

        entity.setPatient(patientEntity);

        IntakeEntity savedEntity = intakeJpaRepository.save(entity);
        return IntakeEntityMapper.toDomain(savedEntity);
    }

}