package com.github.gaalgergo.workscheduler.service.converters;

import com.github.gaalgergo.workscheduler.data.entities.EmployeeEntity;
import com.github.gaalgergo.workscheduler.service.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmployeeEntityConverter implements Converter<EmployeeEntity, Employee> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public Employee convert(final EmployeeEntity employeeEntity) {
        log.trace("Converting employee entity to employee type...");
        return mapper.map(employeeEntity, Employee.class);
    }
}
