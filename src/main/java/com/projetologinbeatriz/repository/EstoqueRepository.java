package com.projetologinbeatriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetologinbeatriz.entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    Estoque findByProdutoId(Long produtoId);

}