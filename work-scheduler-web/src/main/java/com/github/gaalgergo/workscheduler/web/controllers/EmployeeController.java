package com.github.gaalgergo.workscheduler.web.controllers;

import com.github.gaalgergo.workscheduler.service.employees.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ModelAndView getUsersPage(final ModelAndView modelAndView) {
        modelAndView.setViewName("employees");
        modelAndView.addObject("employees", employeeService.getAll());
        return modelAndView;
    }
}
