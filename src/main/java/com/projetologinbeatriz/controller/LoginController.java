package com.projetologinbeatriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetologinbeatriz.entity.Login;
import com.projetologinbeatriz.service.LoginService;

@RestController
@RequestMapping("/users")
public class LoginController {

	private final LoginService loginService;

	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}

	// LOGIN (AUTENTICAR)
	@PostMapping("/login")
	public ResponseEntity<?> autenticar(@RequestBody Login login) {

		Login autenticado = loginService.authenticate(login.getUsername(), login.getPassword());

		if (autenticado != null) {
			return ResponseEntity.ok(autenticado);
		}

		return ResponseEntity.status(401).body("Usuário ou senha inválidos");
	}

	// CADASTRAR
	@PostMapping
	public Login salvar(@RequestBody Login login) {
		return loginService.salvar(login);
	}
}