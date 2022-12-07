package com.example.springboot.service;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }


    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }


    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
