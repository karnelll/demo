package com.portfolio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // 기본 CRUD 메서드 자동 제공
    // save(), findAll(), findById(), deleteById() 등
}
