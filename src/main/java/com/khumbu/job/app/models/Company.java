package com.khumbu.job.app.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Company {
    @GeneratedValue(generator="company_sequence_generator", strategy = GenerationType.AUTO)
    @SequenceGenerator(name="company_sequence_generator", sequenceName = "company_sequence", initialValue=1000)
    @Id
    private long id;
    private String name;
    private String website;
    private String location;
    private LocalDateTime createdAt;

    public Company() {
    }

    public Company(long id, String name, String website, String location, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.location = location;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", location='" + location + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
