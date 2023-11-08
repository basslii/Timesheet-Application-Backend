package com.example.demo.serviceImp;

import com.example.demo.repositories.TaskRepository;
import com.example.demo.classes.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImp implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository){
        super();
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasksByKeyword(String keyword) {
        return taskRepository.findAll()
                .stream()
//                .filter(task -> task.getTask().contains(keyword) || task.getProject().contains(keyword))
                .filter(task -> task.getTask().contains(keyword))
                .collect(Collectors.toList());
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Integer id) {
        // convert to int
        taskRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found with ID: " + id));
        taskRepository.deleteById(id);
    }
}
