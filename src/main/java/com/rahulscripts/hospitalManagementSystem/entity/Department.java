package com.rahulscripts.hospitalManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.print.Doc;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(nullable = false)
    private Doctor headDoctor;

    @ManyToMany
    private Set<Doctor> doctors = new HashSet<>();
}
