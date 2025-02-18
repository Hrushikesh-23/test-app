package com.example.testapp.repository;

import com.example.starterlogs.Loggable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    private static final Logger logger = LoggerFactory.getLogger(TestRepository.class);

    @Loggable
    public String saveData(String data) {
        // Simulating DB save operation
        String upperCaseData = data.toUpperCase();
        logger.info("Saving name in uppercase: {}", upperCaseData);
        return upperCaseData;

    }
}
