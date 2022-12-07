package com.example.springboot.service;

import com.example.springboot.model.User;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface UserService {
    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getById(Long id);

    List<User> findAll();
}

