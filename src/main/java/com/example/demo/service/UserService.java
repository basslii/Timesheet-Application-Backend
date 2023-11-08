package com.example.demo.service;


import com.example.demo.classes.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Integer id);
}
