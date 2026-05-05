package com.projetologinbeatriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetologinbeatriz.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findByUsername(String username);

}