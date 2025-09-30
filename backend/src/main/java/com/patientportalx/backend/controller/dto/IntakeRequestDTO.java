package com.patientportalx.backend.controller.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IntakeRequestDTO {
    private Boolean hasChronicIllness;
    private String chronicIllnessDetails;
    private Boolean takesMedication;
    private String medicationDetails;
    private Boolean hasAllergies;
    private String allergyDetails;
    private Boolean hasSurgeries;
    private String surgeryDetails;
    private Boolean smokes;
    private Boolean drinksAlcohol;
    private String alcoholFrequency;
    private Boolean exercisesRegularly;
    private String exerciseFrequency;
    private String primaryComplaint;
    private String symptomStart;
    private Integer symptomSeverity;
    private String additionalNotes;
}