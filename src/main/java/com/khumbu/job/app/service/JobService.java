package com.khumbu.job.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.khumbu.job.app.models.Job;
import com.khumbu.job.app.repository.JobRepository;

@Component
@Profile("!configure")
public class JobService {
	
	
	private JobRepository jobRepository;

	public JobService(JobRepository jobRepository) {
	
		this.jobRepository = jobRepository;
	}
	
	
	
	public Job save(Job job) {
		return jobRepository.save(job);
	}

}
