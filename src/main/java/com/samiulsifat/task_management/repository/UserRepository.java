package com.samiulsifat.task_management.repository;

import com.samiulsifat.task_management.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    void register(User user);
    List<User> getAllUser();
}
