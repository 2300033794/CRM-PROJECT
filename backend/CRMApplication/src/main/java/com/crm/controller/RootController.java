package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "*")
public class RootController {

    @GetMapping("/")
    public String redirectToSwaggerUi() {
        return "redirect:/swagger-ui.html";
    }
}
