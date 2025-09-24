package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.UserEntity;
import com.patientportalx.backend.domain.enums.CaseStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import com.patientportalx.backend.infrastructure.entity.CaseEntity;

import java.util.List;

public interface CaseRepository extends JpaRepository<CaseEntity, Long> {
    List<CaseEntity> findByPatient(UserEntity patient);
    List<CaseEntity> findByStaff(UserEntity staff);
    List<CaseEntity> findByStatus(CaseStatus status);
}