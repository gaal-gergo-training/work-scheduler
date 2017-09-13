package com.github.gaalgergo.workscheduler.web.controllers;

import com.github.gaalgergo.workscheduler.service.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages/login")
public class LoginController {

    @GetMapping
    public String login(final Model model) {
        Employee employee = new Employee();
        model.addAttribute("userLogin", employee);
        return "login";
    }
}
