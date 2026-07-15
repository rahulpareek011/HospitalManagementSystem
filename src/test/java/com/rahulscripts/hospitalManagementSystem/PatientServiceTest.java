package com.rahulscripts.hospitalManagementSystem;

import com.rahulscripts.hospitalManagementSystem.entity.Appointment;
import com.rahulscripts.hospitalManagementSystem.entity.Insurance;
import com.rahulscripts.hospitalManagementSystem.entity.Patient;
import com.rahulscripts.hospitalManagementSystem.service.AppointmentService;
import com.rahulscripts.hospitalManagementSystem.service.InsuranceService;
import com.rahulscripts.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void assignInsuranceToThePatient(){
        Insurance insurance = Insurance.builder()
                .createdAt(LocalDateTime.now())
                .policyNumber("HR 057")
                .provider("HR pvt ltd")
                .validUntil(Date.valueOf("2030-08-20"))
                .build();
        Insurance updatedInsurance = patientService.assignInsuranceToPatient(insurance,1L);
        System.out.println(updatedInsurance);
    }

    @Test
    public void testCreateNewAppointment(){
        Appointment appointment = Appointment.builder()
                        .appointmentTime(LocalDateTime.of(2025, 11, 1, 14, 0, 0))
                        .reason("Cancer")
                        .build();
        var updatedAppointment = appointmentService.createANewAppointment(appointment,1L,1L);
        System.out.println(updatedAppointment);
        patientService.deletePatient(1L);
    }

}

