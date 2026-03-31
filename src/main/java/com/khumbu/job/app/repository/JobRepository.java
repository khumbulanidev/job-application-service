package com.khumbu.job.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khumbu.job.app.models.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
