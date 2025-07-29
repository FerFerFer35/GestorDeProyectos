package com.api.projectflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.projectflow.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
