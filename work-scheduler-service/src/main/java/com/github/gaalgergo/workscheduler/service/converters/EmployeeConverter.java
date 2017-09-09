package com.github.gaalgergo.workscheduler.service.converters;

import com.github.gaalgergo.workscheduler.data.entities.EmployeeEntity;
import com.github.gaalgergo.workscheduler.service.domain.Employee;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter implements Converter<Employee, EmployeeEntity> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public EmployeeEntity convert(final Employee employee) {
        return mapper.map(employee, EmployeeEntity.class);
    }
}
