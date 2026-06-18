package com.projetologinbeatriz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetologinbeatriz.entity.Estoque;
import com.projetologinbeatriz.repository.EstoqueRepository;

@Service
public class EstoqueService {

	private final EstoqueRepository estoqueRepository;

	@Autowired
	public EstoqueService(EstoqueRepository estoqueRepository) {
		this.estoqueRepository = estoqueRepository;
	}

	public Estoque salvar(Estoque estoque) {
		return estoqueRepository.save(estoque);
	}

	public List<Estoque> listar() {
		return estoqueRepository.findAll();
	}

	public Estoque buscarPorId(Long id) {
		return estoqueRepository.findById(id).orElse(null);
	}

	public Estoque atualizar(Long id, Estoque estoqueAtualizado) {

		Estoque estoque = estoqueRepository.findById(id).orElse(null);

		if (estoque != null) {

			estoque.setLocalizacao(estoqueAtualizado.getLocalizacao());
			estoque.setQuantidade(estoqueAtualizado.getQuantidade());

			return estoqueRepository.save(estoque);
		}

		return null;
	}
	public Estoque buscarPorProduto(Long produtoId) {
	    return estoqueRepository.findByProdutoId(produtoId);
	}

	public void deletar(Long id) {
		estoqueRepository.deleteById(id);
	}
}