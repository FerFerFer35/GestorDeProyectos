package com.api.projectflow.repository;

import org.springframework.stereotype.Repository;

import com.api.projectflow.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existByCorreo(String correo);

    Optional<User> findByCorreo(String correo);
}
