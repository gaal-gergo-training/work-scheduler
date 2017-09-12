package com.github.gaalgergo.workscheduler.web.controllers;

import com.github.gaalgergo.workscheduler.service.domain.Employee;
import com.github.gaalgergo.workscheduler.service.employees.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping
public class RegistrationController {

    @Autowired
    private EmployeeService employeeService;

    @InitBinder
    protected void initBinder(final WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(final String text) throws IllegalArgumentException {
                setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        });
    }

    @GetMapping("/pages/registration")
    public String registration(final Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "registration";
    }
    @PostMapping("/registration")
    public void registrationSubmit(final Employee employee) {
        employeeService.save(employee);
        System.out.println(employee);
    }
}
