package com.github.gaalgergo.workscheduler.data.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
public class VacationRequestEntity extends BaseEntity{

    private LocalDate vacationStart;
    private LocalDate vacationEnd;

}
