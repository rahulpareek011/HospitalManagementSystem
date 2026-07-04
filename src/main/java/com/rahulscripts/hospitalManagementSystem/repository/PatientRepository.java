package com.rahulscripts.hospitalManagementSystem.repository;

import com.rahulscripts.hospitalManagementSystem.dto.BloodGroupStats;
import com.rahulscripts.hospitalManagementSystem.dto.CPatientInfo;
import com.rahulscripts.hospitalManagementSystem.dto.IPatientInfo;
import com.rahulscripts.hospitalManagementSystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    //Interface Projection
    //Not managed by HibernateNot managed by Hibernate
    //Read-only projection
    @Query("select p.id as id,p.name as name,p.email as email from Patient p")
    List<IPatientInfo> getAllPatientInfo();

    @Query("select new com.rahulscripts.hospitalManagementSystem.dto.CPatientInfo(p.name,p.gender) from Patient p")
    List<CPatientInfo> getAllPatientInfoConcrete();

    @Query("select new com.rahulscripts.hospitalManagementSystem.dto.BloodGroupStats(p.bloodGroup,COUNT(p)) from Patient p group by p.bloodGroup order by COUNT(p) DESC")
    List<BloodGroupStats> getBloodGroupAndCount();
}
