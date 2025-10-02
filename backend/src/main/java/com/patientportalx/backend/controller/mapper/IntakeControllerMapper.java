package com.patientportalx.backend.controller.mapper;

import com.patientportalx.backend.controller.dto.IntakeRequestDTO;
import com.patientportalx.backend.controller.dto.IntakeResponseDTO;
import com.patientportalx.backend.domain.model.Intake;

public class IntakeControllerMapper {

    public static Intake toDomain(IntakeRequestDTO dto) {
        return Intake.builder()
                .id(null)
                .patientId(dto.getPatientId())
                .hasChronicIllness(dto.getHasChronicIllness())
                .chronicIllnessDetails(dto.getChronicIllnessDetails())
                .takesMedication(dto.getTakesMedication())
                .medicationDetails(dto.getMedicationDetails())
                .hasAllergies(dto.getHasAllergies())
                .allergyDetails(dto.getAllergyDetails())
                .hasSurgeries(dto.getHasSurgeries())
                .surgeryDetails(dto.getSurgeryDetails())
                .smokes(dto.getSmokes())
                .drinksAlcohol(dto.getDrinksAlcohol())
                .alcoholFrequency(dto.getAlcoholFrequency())
                .exercisesRegularly(dto.getExercisesRegularly())
                .exerciseFrequency(dto.getExerciseFrequency())
                .primaryComplaint(dto.getPrimaryComplaint())
                .symptomStart(dto.getSymptomStart())
                .symptomSeverity(dto.getSymptomSeverity())
                .additionalNotes(dto.getAdditionalNotes())
                .createdAt(null)
                .build();
    }

    public static IntakeResponseDTO toDto(Intake intake) {
        return new IntakeResponseDTO(
                intake.getId(),
                intake.getPatientId(),
                intake.getHasChronicIllness(),
                intake.getChronicIllnessDetails(),
                intake.getTakesMedication(),
                intake.getMedicationDetails(),
                intake.getHasAllergies(),
                intake.getAllergyDetails(),
                intake.getHasSurgeries(),
                intake.getSurgeryDetails(),
                intake.getSmokes(),
                intake.getDrinksAlcohol(),
                intake.getAlcoholFrequency(),
                intake.getExercisesRegularly(),
                intake.getExerciseFrequency(),
                intake.getPrimaryComplaint(),
                intake.getSymptomStart(),
                intake.getSymptomSeverity(),
                intake.getAdditionalNotes(),
                intake.getCreatedAt() != null ? intake.getCreatedAt().toString() : null
        );
    }
}