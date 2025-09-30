package com.patientportalx.backend.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Intake {
    private final Long id;

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

    public Intake(Long id,
                  Boolean hasChronicIllness, String chronicIllnessDetails, Boolean takesMedication, String medicationDetails,
                  Boolean hasAllergies, String allergyDetails, Boolean hasSurgeries, String surgeryDetails,
                  Boolean smokes, Boolean drinksAlcohol, String alcoholFrequency,
                  Boolean exercisesRegularly, String exerciseFrequency, String primaryComplaint, String symptomStart,
                  Integer symptomSeverity, String additionalNotes){
        this.id = id;
        this.hasChronicIllness = hasChronicIllness != null ? hasChronicIllness : false;
        this.chronicIllnessDetails = chronicIllnessDetails;

        this.takesMedication = takesMedication != null ? takesMedication : false;
        this.medicationDetails = medicationDetails;

        this.hasAllergies = hasAllergies != null ? hasAllergies : false;
        this.allergyDetails = allergyDetails;

        this.hasSurgeries = hasSurgeries != null ? hasSurgeries : false;
        this.surgeryDetails = surgeryDetails;

        this.smokes = smokes != null ? smokes : false;

        this.drinksAlcohol = drinksAlcohol != null ? drinksAlcohol : false;
        this.alcoholFrequency = alcoholFrequency;

        this.exercisesRegularly = exercisesRegularly != null ? exercisesRegularly : false;
        this.exerciseFrequency = exerciseFrequency;

        updateComplaint(primaryComplaint);
        updateSymptomStart(symptomStart);
        updateSymptomSeverity(symptomSeverity);

        this.additionalNotes = additionalNotes;
    }

    public void updateComplaint(String complaint) {
        this.primaryComplaint = complaint;
    }

    public void updateSymptomStart(String start) {
        this.symptomStart = start;
    }

    public void updateSymptomSeverity(Integer severity) {
        this.symptomSeverity = severity;
    }

    public void updateNotes(String notes) {
        this.additionalNotes = notes;
    }
}