package com.api.projectflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.projectflow.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
