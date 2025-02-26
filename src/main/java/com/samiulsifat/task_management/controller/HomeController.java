package com.samiulsifat.task_management.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homepage(HttpServletRequest request) {
        return "Hello World" + request.getSession().getId();
    }
}
