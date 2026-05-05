package com.projetologinbeatriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetologinbeatriz.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
