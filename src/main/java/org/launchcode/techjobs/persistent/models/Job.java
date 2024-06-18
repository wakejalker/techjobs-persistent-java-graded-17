package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @NotBlank(message = "Skills cannot be empty")


    private String skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, String skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

}
