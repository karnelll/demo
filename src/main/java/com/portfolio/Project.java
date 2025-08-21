package com.portfolio;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String period;
    private String description;
    private String techStack;
    private String repositoryUrl;

    // 기본 생성자 (JPA 필수)
    public Project() {}

    // 생성자
    public Project(String title, String period, String description, String techStack, String repositoryUrl) {
        this.title = title;
        this.period = period;
        this.description = description;
        this.techStack = techStack;
        this.repositoryUrl = repositoryUrl;
    }

    // Getter, Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getPeriod() { return period; }
    public void setPeriod(String period) { this.period = period; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getTechStack() { return techStack; }
    public void setTechStack(String techStack) { this.techStack = techStack; }

    public String getRepositoryUrl() { return repositoryUrl; }
    public void setRepositoryUrl(String repositoryUrl) { this.repositoryUrl = repositoryUrl; }
}
