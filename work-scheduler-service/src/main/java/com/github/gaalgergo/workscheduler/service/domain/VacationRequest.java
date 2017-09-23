package com.github.gaalgergo.workscheduler.service.domain;

import com.github.gaalgergo.workscheduler.data.entities.EmployeeEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class VacationRequest {

    private EmployeeEntity employeeEntity;
    private LocalDate vacationStart;
    private LocalDate vacationEnd;

}
