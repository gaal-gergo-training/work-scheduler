package com.github.gaalgergo.workscheduler.data.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employees")
public class EmployeeEntity extends BaseEntity {
    private String name;
}
