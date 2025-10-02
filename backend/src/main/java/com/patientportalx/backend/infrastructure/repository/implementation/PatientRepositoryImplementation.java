package com.patientportalx.backend.infrastructure.repository.implementation;

import com.patientportalx.backend.domain.model.Patient;
import com.patientportalx.backend.domain.repository.PatientRepository;
import com.patientportalx.backend.infrastructure.entity.PatientEntity;
import com.patientportalx.backend.infrastructure.mapper.PatientEntityMapper;
import com.patientportalx.backend.infrastructure.repository.PatientJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PatientRepositoryImplementation implements PatientRepository {

    private final PatientJpaRepository patientJpaRepository;

    public PatientRepositoryImplementation(PatientJpaRepository patientJpaRepository) {
        this.patientJpaRepository = patientJpaRepository;
    }

    @Override
    public Optional<Patient> findById(Long id){
        Optional<PatientEntity> result = patientJpaRepository.findById(id);
        if(result.isPresent()){
            PatientEntity patientEntity = result.get();
            Patient patient = PatientEntityMapper.toDomain(patientEntity);
            return Optional.of(patient);
        }

        return Optional.empty();
    }

    @Override
    public List<Patient> findAllPatients() {
        List<PatientEntity> entities = patientJpaRepository.findAll();
        List<Patient> patients = new ArrayList<>();

        for (PatientEntity entity : entities) {
            patients.add(PatientEntityMapper.toDomain(entity));
        }

        return patients;
    }

    @Override
    public Patient save (Patient patient){
        PatientEntity patientEntity = PatientEntityMapper.toEntity(patient);
        PatientEntity patientEntitySaved = patientJpaRepository.save(patientEntity);
        return PatientEntityMapper.toDomain(patientEntitySaved);
    }
}