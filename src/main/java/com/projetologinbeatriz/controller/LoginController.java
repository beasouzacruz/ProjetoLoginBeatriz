package com.projetologinbeatriz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetologinbeatriz.entity.Login;
import com.projetologinbeatriz.service.LoginService;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class LoginController {

	private final LoginService loginService;

	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}

	@PostMapping
	public Login salvar(@RequestBody Login login) {
		return loginService.salvar(login);
	}

	@GetMapping
	public List<Login> listar() {
		return loginService.listar();
	}
}