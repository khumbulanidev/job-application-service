package com.khumbu.job.app.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Interviews {

    @Id
    @GeneratedValue(generator="interview_sequence_generator", strategy = GenerationType.AUTO)
    @SequenceGenerator(name="interview_sequence_generator", sequenceName = "interview_sequence",allocationSize = 100, initialValue=1000)
    private Long id;

    private Long jobApplicationId;

    private String round;
    private LocalDateTime scheduledAt;
    private String interviewerName;
    private String interviewerEmail;
    private String feedback;
    private String result;
    private  LocalDateTime createdAt;

    public Interviews() {
    }

    public Interviews(Long id, Long jobApplicationId, String round, LocalDateTime scheduledAt,
                      String interviewerName, String interviewerEmail, String feedback, String result, LocalDateTime createdAt) {
        this.id = id;
        this.jobApplicationId = jobApplicationId;
        this.round = round;
        this.scheduledAt = scheduledAt;
        this.interviewerName = interviewerName;
        this.interviewerEmail = interviewerEmail;
        this.feedback = feedback;
        this.result = result;
        this.createdAt = createdAt;
    }

    public Interviews(Long id, String round, LocalDateTime scheduledAt,
                      String interviewerName, String interviewerEmail, String feedback, String result, LocalDateTime createdAt) {
        this.id = id;
        this.round = round;
        this.scheduledAt = scheduledAt;
        this.interviewerName = interviewerName;
        this.interviewerEmail = interviewerEmail;
        this.feedback = feedback;
        this.result = result;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobApplicationId() {
        return jobApplicationId;
    }

    public void setJobApplicationId(Long jobApplicationId) {
        this.jobApplicationId = jobApplicationId;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public LocalDateTime getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(LocalDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getInterviewerEmail() {
        return interviewerEmail;
    }

    public void setInterviewerEmail(String interviewerEmail) {
        this.interviewerEmail = interviewerEmail;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Interviews{" +
                "id=" + id +
                ", jobApplicationId=" + jobApplicationId +
                ", round='" + round + '\'' +
                ", scheduledAt=" + scheduledAt +
                ", interviewerName='" + interviewerName + '\'' +
                ", interviewerEmail='" + interviewerEmail + '\'' +
                ", feedback='" + feedback + '\'' +
                ", result='" + result + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
