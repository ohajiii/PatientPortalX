package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.CaseEntity;
import com.patientportalx.backend.infrastructure.entity.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<ReportEntity, Long> {
    List<ReportEntity> findByCaseEntity(CaseEntity caseEntity);
}