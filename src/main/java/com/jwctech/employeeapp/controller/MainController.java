package com.jwctech.employeeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String employeeHome(Model model){
        model.addAttribute("name", "James");
        model.addAttribute("location", "Raleigh");
        return "home";
    }

    @RequestMapping("/location/{location}")
    public String employeeLocation(Model model){
        model.addAttribute("name", "James");
        model.addAttribute("location", "Raleigh");
        return "location";
    }
}
