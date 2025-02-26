package com.samiulsifat.task_management.service;

import com.samiulsifat.task_management.model.User;
import com.samiulsifat.task_management.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserRepository {

    List<User> users = new ArrayList<>();

    @Override
    public void create(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }
}
