package com.example.testapp.service;

import com.example.starterlogs.Loggable;
import com.example.testapp.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    @Loggable
    public String processName(String name) {
        return "Processed: " + testRepository.saveData(name);
    }
}
