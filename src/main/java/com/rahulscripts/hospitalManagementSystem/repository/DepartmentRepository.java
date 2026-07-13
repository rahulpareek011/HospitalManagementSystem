package com.rahulscripts.hospitalManagementSystem.repository;

import com.rahulscripts.hospitalManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}