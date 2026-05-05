package com.projetologinbeatriz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetologinbeatriz.entity.Login;
import com.projetologinbeatriz.repository.LoginRepository;

@Service
public class LoginService {

	private final LoginRepository loginRepository;

	@Autowired
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}

	public Login salvar(Login login) {
		return loginRepository.save(login);
	}

	public List<Login> listar() {
		return loginRepository.findAll();
	}
}