package com.api.projectflow.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String correo;

    @Column(nullable = false)
    private String contrasena;

    // Proyectos creados por el usuario
    @OneToMany(mappedBy = "owner")
    private List<Project> proyectosCreados;

    // Proyectos donde colabora
    @ManyToMany(mappedBy = "collaborators")
    private List<Project> proyectosColaborados;

    @ManyToMany(mappedBy = "assignedUsers")
    private List<Task> tasks;

}
