package com.khumbu.job.app.models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(generator="job_sequence_generator", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="job_sequence_generator", sequenceName = "job_sequence",allocationSize = 100, initialValue=1000)
	private Long jobId;
	private String name;
	private String description;
	public Job() {
		
	}
	public Job(Long jobId, String name, String description) {
		super();
		this.jobId = jobId;
		this.name = name;
		this.description = description;
	}
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	
	

}
