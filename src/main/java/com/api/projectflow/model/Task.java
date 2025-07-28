package com.api.projectflow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @Column(nullable = false)
    private String taskTitle;

    @Column
    private String taskDescription;

    // Relación con el proyecto al que pertenece
    @ManyToOne
    @JoinColumn(name = "projectId", nullable = false)
    private Project project;

    // Usuario asignado a la tarea
    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private User assignedUser;
}
