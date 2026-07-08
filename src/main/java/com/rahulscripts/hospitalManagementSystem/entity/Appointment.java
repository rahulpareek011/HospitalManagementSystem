package com.rahulscripts.hospitalManagementSystem.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    private String reason;

    private String status;

    @ManyToOne()
    @JoinColumn()
    private Patient patient;

}
