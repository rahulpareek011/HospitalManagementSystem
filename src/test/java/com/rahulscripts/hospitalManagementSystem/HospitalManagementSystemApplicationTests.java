package com.rahulscripts.hospitalManagementSystem;

import com.rahulscripts.hospitalManagementSystem.dto.BloodGroupStats;
import com.rahulscripts.hospitalManagementSystem.dto.CPatientInfo;
import com.rahulscripts.hospitalManagementSystem.dto.IPatientInfo;
import com.rahulscripts.hospitalManagementSystem.entity.Patient;
import com.rahulscripts.hospitalManagementSystem.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HospitalManagementSystemApplicationTests {

	@Autowired
	PatientRepository patientRepository;

	@Test
	void LoadAllPatients(){
		List<IPatientInfo> patients = patientRepository.getAllPatientInfo();
		for(var p: patients){
			System.out.println(p);
		}
		System.out.println();
		System.out.println();
		List<CPatientInfo> patientDetails = patientRepository.getAllPatientInfoConcrete();
		for(var p: patientDetails){
			System.out.println(p);
		}
		System.out.println();
		System.out.println();
		List<BloodGroupStats> bloodGroups = patientRepository.getBloodGroupAndCount();
		for(var p: bloodGroups){
			System.out.println(p);
		}
	}
}
