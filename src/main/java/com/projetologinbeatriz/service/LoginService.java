package com.projetologinbeatriz.service;

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

	public Login authenticate(String username, String password) {

		Login user = loginRepository.findByUsername(username);

		if (user != null && user.getPassword().equals(password)) {
			return user;
		}

		return null;
	}

	public Login salvar(Login login) {
		return loginRepository.save(login);
	}
}