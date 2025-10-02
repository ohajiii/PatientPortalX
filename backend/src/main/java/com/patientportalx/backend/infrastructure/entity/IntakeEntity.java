package com.patientportalx.backend.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "intakes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntakeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "has_chronic_illness", nullable = false)
    private Boolean hasChronicIllness;

    @Column(name = "chronic_illness_details", columnDefinition = "TEXT")
    private String chronicIllnessDetails;

    @Column(name = "takes_medication", nullable = false)
    private Boolean takesMedication;

    @Column(name = "medication_details", columnDefinition = "TEXT")
    private String medicationDetails;

    @Column(name = "has_allergies", nullable = false)
    private Boolean hasAllergies;

    @Column(name = "allergy_details", columnDefinition = "TEXT")
    private String allergyDetails;

    @Column(name = "has_surgeries", nullable = false)
    private Boolean hasSurgeries;

    @Column(name = "surgery_details", columnDefinition = "TEXT")
    private String surgeryDetails;

    @Column(name = "smokes", nullable = false)
    private Boolean smokes;

    @Column(name = "drinks_alcohol", nullable = false)
    private Boolean drinksAlcohol;

    @Column(name = "alcohol_frequency", length = 100)
    private String alcoholFrequency;

    @Column(name = "exercises_regularly", nullable = false)
    private Boolean exercisesRegularly;

    @Column(name = "exercise_frequency", length = 100)
    private String exerciseFrequency;

    @Column(name = "primary_complaint", columnDefinition = "TEXT")
    private String primaryComplaint;

    @Column(name = "symptom_start", length = 100)
    private String symptomStart;

    @Column(name = "symptom_severity")
    private Integer symptomSeverity;

    @Column(name = "additional_notes", columnDefinition = "TEXT")
    private String additionalNotes;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;
}