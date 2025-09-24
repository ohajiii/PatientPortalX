package com.patientportalx.backend.infrastructure.repository;

import com.patientportalx.backend.infrastructure.entity.NotificationEntity;
import com.patientportalx.backend.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {
    List<NotificationEntity> findByPatient(UserEntity patient);
    List<NotificationEntity> findByStaff(UserEntity staff);
}