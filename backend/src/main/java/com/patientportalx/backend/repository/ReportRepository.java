package com.patientportalx.backend.repository;

import com.patientportalx.backend.entity.CaseEntity;
import com.patientportalx.backend.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByCaseEntity(CaseEntity caseEntity);
}