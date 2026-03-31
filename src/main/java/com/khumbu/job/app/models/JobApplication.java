package com.khumbu.job.app.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class JobApplication {
    @Id
    @GeneratedValue(generator="job_app_sequence_generator", strategy = GenerationType.AUTO)
    @SequenceGenerator(name="job_app_sequence_generator", sequenceName = "job_app_sequence",allocationSize = 100, initialValue=1000)
    private long id;

    private long userId;
    private long companyId;

    private String jobTitle;
    private  String description;
    private String salaryRange;
    private String jobUrl;
    private String location;
    private boolean remote;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Status status;


    public JobApplication() {
    }

    public JobApplication(long id, long userId, long companyId, String jobTitle, String description,
                          String salaryRange, String jobUrl, String location, boolean remote, LocalDateTime createdAt,
                          LocalDateTime updatedAt, Status status) {
        this.id = id;
        this.userId = userId;
        this.companyId = companyId;
        this.jobTitle = jobTitle;
        this.description = description;
        this.salaryRange = salaryRange;
        this.jobUrl = jobUrl;
        this.location = location;
        this.remote = remote;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getJobUrl() {
        return jobUrl;
    }

    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
