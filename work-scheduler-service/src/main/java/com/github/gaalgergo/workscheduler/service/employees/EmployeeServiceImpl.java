package com.github.gaalgergo.workscheduler.service.employees;

import com.github.gaalgergo.workscheduler.data.entities.EmployeeEntity;
import com.github.gaalgergo.workscheduler.data.repositories.EmployeeRepository;
import com.github.gaalgergo.workscheduler.service.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ConversionService conversionService;

    @Override
    public Collection<Employee> getAll() {
        log.debug("Retrieving every employee data from database...");

        return employeeRepository.findAll().stream()
            .map(entity -> conversionService.convert(entity, Employee.class))
            .collect(Collectors.toList());
    }

    @Override
    public void save(final Employee employee) {
       employeeRepository.save(conversionService.convert(employee, EmployeeEntity.class));
    }

}
