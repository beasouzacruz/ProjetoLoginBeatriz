package com.projetologinbeatriz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projetologinbeatriz.entity.Estoque;
import com.projetologinbeatriz.service.EstoqueService;

@RestController
@RequestMapping("/estoque")
@CrossOrigin("*")
public class EstoqueController {

	private final EstoqueService estoqueService;

	@Autowired
	public EstoqueController(EstoqueService estoqueService) {
		this.estoqueService = estoqueService;
	}

	@PostMapping
	public Estoque salvar(@RequestBody Estoque estoque) {
		return estoqueService.salvar(estoque);
	}

	@GetMapping
	public List<Estoque> listar() {
		return estoqueService.listar();
	}

	@GetMapping("/{id}")
	public Estoque buscarPorId(@PathVariable Long id) {
		return estoqueService.buscarPorId(id);
	}
	
	@GetMapping("/produto/{produtoId}")
	public Estoque buscarPorProduto(@PathVariable Long produtoId) {
	    return estoqueService.buscarPorProduto(produtoId);
	}
	
	@PutMapping("/{id}")
	public Estoque atualizar(
			@PathVariable Long id,
			@RequestBody Estoque estoque) {

		return estoqueService.atualizar(id, estoque);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		estoqueService.deletar(id);
	}
}