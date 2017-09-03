package com.github.gaalgergo.workscheduler.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/pages/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("registration")
    public void registrationSubmit(){
        System.out.println("done");
    }
}
