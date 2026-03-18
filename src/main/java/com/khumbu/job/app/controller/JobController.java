package com.khumbu.job.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khumbu.job.app.models.Job;
import com.khumbu.job.app.service.JobService;

@RestController
@RequestMapping("api/v1/jobs")
public class JobController {
	
	private JobService jobService;
	
	
	
	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}



	@PostMapping("/save")
	public ResponseEntity<Job> save(@RequestBody Job job){
		return ResponseEntity.ok(jobService.save(job));
	}

}
