package com.patientportalx.backend.controller;

import com.patientportalx.backend.controller.dto.PatientRequestDTO;
import com.patientportalx.backend.controller.dto.PatientResponseDTO;
import com.patientportalx.backend.controller.mapper.PatientControllerMapper;
import com.patientportalx.backend.domain.model.Patient;
import com.patientportalx.backend.domain.repository.PatientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @PostMapping
    public ResponseEntity<PatientResponseDTO> createPatient(@RequestBody PatientRequestDTO dto) {
        Patient patient = PatientControllerMapper.toDomain(dto);
        Patient saved = patientRepository.save(patient);
        PatientResponseDTO response = PatientControllerMapper.toDto(saved);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getAllPatients() {
        List<Patient> patients = patientRepository.findAllPatients();
        List<PatientResponseDTO> response = new ArrayList<>();
        for (Patient patient : patients) {
            response.add(PatientControllerMapper.toDto(patient));
        }
        return ResponseEntity.ok(response);
    }
}

