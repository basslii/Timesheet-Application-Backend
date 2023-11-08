package com.example.demo.controllers;

import com.example.demo.classes.Status;
import com.example.demo.classes.User;
import com.example.demo.service.StatusService;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/status")
public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        super();
        this.statusService = statusService;
    }

    @GetMapping()
    public List<Status> getAllStatuses() {
        return statusService.getAllStatuses();
    }


    @GetMapping("/{id}")
    public Status getStatusById(@PathVariable Integer id){
        return statusService.getStatusById(id);
    }


}
