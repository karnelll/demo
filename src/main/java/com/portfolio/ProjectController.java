package com.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "<http://localhost:3000>")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    // 📋 1. READ - 모든 프로젝트 조회
    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // 🔍 1-1. READ - 특정 프로젝트 조회
    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    // ➕ 2. CREATE - 프로젝트 생성
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    // ✏️ 3. UPDATE - 프로젝트 수정
    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project projectDetails) {
        Project project = projectRepository.findById(id).get();
        project.setTitle(projectDetails.getTitle());
        project.setPeriod(projectDetails.getPeriod());
        project.setDescription(projectDetails.getDescription());
        project.setTechStack(projectDetails.getTechStack());
        project.setRepositoryUrl(projectDetails.getRepositoryUrl());
        return projectRepository.save(project);
    }

    // 🗑️ 4. DELETE - 프로젝트 삭제
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }
}
