package com.github.gaalgergo.workscheduler.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;
    private LocalDate birthday;
    private String personalID;
    private int medicalCare;
    private int enabled;
}
