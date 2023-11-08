package com.example.demo.service;

import com.example.demo.classes.Task;

import java.util.Map;
import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTasksByKeyword(String keyword);
    Task updateTask(Task task);
    void deleteTask(Integer id);
}
