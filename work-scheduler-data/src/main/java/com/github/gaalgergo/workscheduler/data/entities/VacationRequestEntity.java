package com.github.gaalgergo.workscheduler.data.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class VacationRequestEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private VacationType type;
    @Enumerated(EnumType.STRING)
    private VacationStatus status;
    @ManyToOne
    private EmployeeEntity employeeEntity;
    private LocalDate startDate;
    private LocalDate endDate;

}
