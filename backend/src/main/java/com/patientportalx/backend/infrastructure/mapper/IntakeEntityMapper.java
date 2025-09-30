package com.patientportalx.backend.infrastructure.mapper;

import com.patientportalx.backend.domain.model.Intake;
import com.patientportalx.backend.infrastructure.entity.IntakeEntity;

public class IntakeEntityMapper {

    public static IntakeEntity toEntity(Intake intake) {
        return IntakeEntity.builder()
                .id(intake.getId())
                .hasChronicIllness(intake.getHasChronicIllness())
                .chronicIllnessDetails(intake.getChronicIllnessDetails())
                .takesMedication(intake.getTakesMedication())
                .medicationDetails(intake.getMedicationDetails())
                .hasAllergies(intake.getHasAllergies())
                .allergyDetails(intake.getAllergyDetails())
                .hasSurgeries(intake.getHasSurgeries())
                .surgeryDetails(intake.getSurgeryDetails())
                .smokes(intake.getSmokes())
                .drinksAlcohol(intake.getDrinksAlcohol())
                .alcoholFrequency(intake.getAlcoholFrequency())
                .exercisesRegularly(intake.getExercisesRegularly())
                .exerciseFrequency(intake.getExerciseFrequency())
                .primaryComplaint(intake.getPrimaryComplaint())
                .symptomStart(intake.getSymptomStart())
                .symptomSeverity(intake.getSymptomSeverity())
                .additionalNotes(intake.getAdditionalNotes())
                .createdAt(intake.getCreatedAt())
                .build();
    }

    public static Intake toDomain(IntakeEntity entity) {
        return Intake.builder()
                .id(entity.getId())
                .hasChronicIllness(entity.getHasChronicIllness())
                .chronicIllnessDetails(entity.getChronicIllnessDetails())
                .takesMedication(entity.getTakesMedication())
                .medicationDetails(entity.getMedicationDetails())
                .hasAllergies(entity.getHasAllergies())
                .allergyDetails(entity.getAllergyDetails())
                .hasSurgeries(entity.getHasSurgeries())
                .surgeryDetails(entity.getSurgeryDetails())
                .smokes(entity.getSmokes())
                .drinksAlcohol(entity.getDrinksAlcohol())
                .alcoholFrequency(entity.getAlcoholFrequency())
                .exercisesRegularly(entity.getExercisesRegularly())
                .exerciseFrequency(entity.getExerciseFrequency())
                .primaryComplaint(entity.getPrimaryComplaint())
                .symptomStart(entity.getSymptomStart())
                .symptomSeverity(entity.getSymptomSeverity())
                .additionalNotes(entity.getAdditionalNotes())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}