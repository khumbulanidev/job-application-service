package com.khumbu.job.app.config;

import com.khumbu.job.app.repository.JobRepository;
import com.khumbu.job.app.service.JobService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("configure")
public class ServicesConfig {


    @Bean
    public JobService jobService(JobRepository jobRepository){
        return new JobService(jobRepository);
    }
}
