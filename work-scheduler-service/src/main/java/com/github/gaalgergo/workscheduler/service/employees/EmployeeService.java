package com.github.gaalgergo.workscheduler.service.employees;

import com.github.gaalgergo.workscheduler.service.domain.Employee;

import java.util.Collection;

public interface EmployeeService {
    Collection<Employee> getAll();
}
