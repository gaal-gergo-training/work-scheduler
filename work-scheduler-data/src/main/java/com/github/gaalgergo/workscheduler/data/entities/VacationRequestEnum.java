package com.github.gaalgergo.workscheduler.data.entities;

import javax.persistence.Entity;

@Entity
public enum VacationRequestEnum {
    ILL,
    HOLIDAY,
    NO_PAID_LEAVE,
    OTHER,
    ACCEPTED,
    IN_PROGRESS,
    REJECTED
}
