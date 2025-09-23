package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.CaseEntity;
import com.patientportalx.backend.infrastructure.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByCaseEntity(CaseEntity caseEntity);
}