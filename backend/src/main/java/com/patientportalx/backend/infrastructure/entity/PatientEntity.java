package com.patientportalx.backend.infrastructure.entity;

import com.patientportalx.backend.domain.enums.BloodType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(length = 10)
    private String gender;

    @Enumerated(EnumType.STRING)
    @Column(name ="blood_type", nullable = false, length = 15)
    private BloodType bloodType;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private UserEntity user;

}
