package com.patientportalx.backend.controller;

import com.patientportalx.backend.controller.dto.IntakeRequestDTO;
import com.patientportalx.backend.controller.dto.IntakeResponseDTO;
import com.patientportalx.backend.controller.mapper.IntakeControllerMapper;
import com.patientportalx.backend.domain.model.Intake;
import com.patientportalx.backend.service.IntakeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/intakes")
public class IntakeController {

    private final IntakeService intakeService;

    public IntakeController(IntakeService intakeService) {
        this.intakeService = intakeService;
    }

    @PostMapping
    public ResponseEntity<IntakeResponseDTO> createIntake(@RequestBody IntakeRequestDTO dto) {
        Intake intake = IntakeControllerMapper.toDomain(dto);

        Intake saved = intakeService.createIntake(intake, dto.getPatientId());

        IntakeResponseDTO response = IntakeControllerMapper.toDto(saved);

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<IntakeResponseDTO>> getAllIntakes() {
        List<Intake> intakes = intakeService.getAllIntakes();

        List<IntakeResponseDTO> response = new ArrayList<>();

        for (Intake intake : intakes) {
            response.add(IntakeControllerMapper.toDto(intake));
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IntakeResponseDTO> getIntakeById(@PathVariable Long id) {
        Intake intake = intakeService.getIntakeById(id);

        IntakeResponseDTO response = IntakeControllerMapper.toDto(intake);

        return ResponseEntity.ok(response);
    }
}
