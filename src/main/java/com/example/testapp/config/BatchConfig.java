//package com.example.testapp.config;
//
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.configuration.support.DefaultBatchConfiguration;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.PlatformTransactionManager;
//
//
//@Configuration
//@EnableBatchProcessing
//public class BatchConfig {
//
//    @Autowired
//    private JobRepository jobRepository;
//
//    @Autowired
//    private PlatformTransactionManager transactionManager;
//
//    @Bean
//    public JobBuilderFactory jobBuilderFactory() {
//        return new JobBuilderFactory(jobRepository);
//    }
//
//    @Bean
//    public StepBuilderFactory stepBuilderFactory() {
//        return new StepBuilderFactory(jobRepository, transactionManager);
//    }
//}
//
//
