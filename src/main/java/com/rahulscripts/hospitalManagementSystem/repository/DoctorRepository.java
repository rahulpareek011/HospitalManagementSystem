package com.rahulscripts.hospitalManagementSystem.repository;

import com.rahulscripts.hospitalManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}