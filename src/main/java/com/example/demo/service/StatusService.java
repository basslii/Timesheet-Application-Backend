package com.example.demo.service;

import com.example.demo.classes.Status;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatuses();
    Status getStatusById(Integer id);
}
