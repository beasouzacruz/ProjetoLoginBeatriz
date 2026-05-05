package com.projetologinbeatriz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetologinbeatriz.entity.Produto;
import com.projetologinbeatriz.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;

	@Autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}

	public List<Produto> listar() {
		return produtoRepository.findAll();
	}
}