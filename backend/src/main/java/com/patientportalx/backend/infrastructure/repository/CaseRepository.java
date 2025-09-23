package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.User;
import com.patientportalx.backend.domain.enums.CaseStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import com.patientportalx.backend.infrastructure.entity.CaseEntity;

import java.util.List;

public interface CaseRepository extends JpaRepository<CaseEntity, Long> {
    List<CaseEntity> findByPatient(User patient);
    List<CaseEntity> findByStaff(User staff);
    List<CaseEntity> findByStatus(CaseStatus status);
}