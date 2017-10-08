package com.github.gaalgergo.workscheduler.service.domain;

import com.github.gaalgergo.workscheduler.data.entities.VacationStatus;
import com.github.gaalgergo.workscheduler.data.entities.VacationType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class VacationRequest {

    private Employee employee;
    private VacationType type;
    private VacationStatus status;
    private LocalDate vacationStart;
    private LocalDate vacationEnd;

}
