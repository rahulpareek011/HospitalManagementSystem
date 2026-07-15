package com.rahulscripts.hospitalManagementSystem.service;

import com.rahulscripts.hospitalManagementSystem.entity.Appointment;
import com.rahulscripts.hospitalManagementSystem.entity.Doctor;
import com.rahulscripts.hospitalManagementSystem.entity.Patient;
import com.rahulscripts.hospitalManagementSystem.repository.AppointmentRepository;
import com.rahulscripts.hospitalManagementSystem.repository.DoctorRepository;
import com.rahulscripts.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointmentRepository.save(appointment);
        return appointment;
    }
}
