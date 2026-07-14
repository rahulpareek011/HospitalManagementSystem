package com.rahulscripts.hospitalManagementSystem.service;

import com.rahulscripts.hospitalManagementSystem.repository.AppointmentRepository;
import com.rahulscripts.hospitalManagementSystem.repository.DoctorRepository;
import com.rahulscripts.hospitalManagementSystem.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public void createANewAppointment(){

    }
}
