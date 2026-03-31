package com.khumbu.job.app.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Notes {

    @Id
    @GeneratedValue(generator="users_sequence_generator", strategy = GenerationType.AUTO)
    @SequenceGenerator(name="users_sequence_generator", sequenceName = "users_sequence",allocationSize = 100, initialValue=1000)
    private Long id;

    private Long jobApplicationId;
    private String note;
    private LocalDateTime created_at;


    public Notes() {
    }

    public Notes(Long id, Long jobApplicationId, String note, LocalDateTime created_at) {
        this.id = id;
        this.jobApplicationId = jobApplicationId;
        this.note = note;
        this.created_at = created_at;
    }

    public Notes(Long id, String note, LocalDateTime created_at) {
        this.id = id;
        this.note = note;
        this.created_at = created_at;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", jobApplicationId=" + jobApplicationId +
                ", note='" + note + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
