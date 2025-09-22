package com.patientportalx.backend.repository;

import com.patientportalx.backend.entity.Notification;
import com.patientportalx.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByPatient(User patient);
    List<Notification> findByStaff(User staff);
}