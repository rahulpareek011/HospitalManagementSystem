package com.rahulscripts.hospitalManagementSystem.service;

import com.rahulscripts.hospitalManagementSystem.entity.Insurance;
import com.rahulscripts.hospitalManagementSystem.entity.Patient;
import com.rahulscripts.hospitalManagementSystem.repository.PatientRepository;

public class PatientService {
    PatientRepository patientRepository;

    public void assignInsuranceToPatient(Insurance insurance,Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();

    }
}
