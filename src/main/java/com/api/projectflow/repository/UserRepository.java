package com.api.projectflow.repository;

import org.springframework.stereotype.Repository;

import com.api.projectflow.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
