package com.github.gaalgergo.workscheduler.data.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employees")
public class EmployeeEntity extends BaseEntity {

    private String name;
    private String email;
    private String username;
    private String password;
    private LocalDate birthday;
    private String personalID;
    private int medicalCare;
    private int enabled;
}
