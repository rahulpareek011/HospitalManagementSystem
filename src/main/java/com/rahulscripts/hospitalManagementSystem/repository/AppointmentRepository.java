package com.rahulscripts.hospitalManagementSystem.repository;

import com.rahulscripts.hospitalManagementSystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}