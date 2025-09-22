package com.patientportalx.backend.repository;

import com.patientportalx.backend.entity.User;
import com.patientportalx.backend.entity.enums.CaseStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import com.patientportalx.backend.entity.CaseEntity;

import java.util.List;

public interface CaseRepository extends JpaRepository<CaseEntity, Long> {
    List<CaseEntity> findByPatient(User patient);
    List<CaseEntity> findByStaff(User staff);
    List<CaseEntity> findByStatus(CaseStatus status);
}