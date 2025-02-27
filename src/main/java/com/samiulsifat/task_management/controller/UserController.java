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
    public String registerUser(@RequestBody @Valid User user) {
        if (userService.getUsers().containsKey(user.getUsername())) {
            return "Registration Failed: username already exists";
        }
        userService.register(user);
        return "Registration Success: User " + user.getUsername() + " has been created.";
    }

}
