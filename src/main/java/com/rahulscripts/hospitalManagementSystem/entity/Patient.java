package com.rahulscripts.hospitalManagementSystem.entity;

import com.rahulscripts.hospitalManagementSystem.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    private String gender;

    @Enumerated(value = EnumType.STRING)
    private BloodGroupType bloodGroup;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "patient_insurance",unique = true)
    private Insurance insurance;//should be owning side

    /*
        * Owning side = the entity whose table contains the foreign key. It is responsible for inserting/updating the relationship.
        * Inverse side (mappedBy) = points to the owning side's field and does not create or manage the foreign key.
        * Without mappedBy, Hibernate assumes both entities own separate relationships, which results in two foreign keys and an incorrect database model.
     */

    @OneToMany(mappedBy = "patient",cascade = {CascadeType.ALL})
    private Set<Appointment> appointments = new HashSet<>();
}
