package com.rahulscripts.hospitalManagementSystem.repository;

import com.rahulscripts.hospitalManagementSystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}