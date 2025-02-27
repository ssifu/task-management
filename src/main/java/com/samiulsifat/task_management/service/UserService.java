package com.samiulsifat.task_management.service;

import com.samiulsifat.task_management.model.User;
import com.samiulsifat.task_management.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements UserRepository {

//    List<User> users = new ArrayList<>();
    Map<String, User> users = new HashMap<>();

    @Override
    public void register(User user) {
        users.put(user.getUsername(), user);
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }

    public Map<String, User> getUsers() {
        return users;
    }
}
