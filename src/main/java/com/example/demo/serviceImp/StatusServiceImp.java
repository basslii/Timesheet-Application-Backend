package com.example.demo.serviceImp;

import com.example.demo.classes.Status;
import com.example.demo.repositories.StatusRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImp implements StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public StatusServiceImp(StatusRepository statusRepository){
        super();
        this.statusRepository = statusRepository;
    }

    @Override
    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

    @Override
    public Status getStatusById(Integer id) {
        return statusRepository.findById(id).orElse(null);
    }
}
