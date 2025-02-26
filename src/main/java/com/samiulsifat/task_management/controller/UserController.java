package com.samiulsifat.task_management.controller;

import com.samiulsifat.task_management.model.User;
import com.samiulsifat.task_management.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userService.getAllUser();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/users/login")
    public String loginUser(@RequestBody @Valid User user) {

    }

    @PostMapping("/users/register")
    public User registerUser(@RequestBody @Valid User user) {
        userService.register(user);
        return user;
    }

}
