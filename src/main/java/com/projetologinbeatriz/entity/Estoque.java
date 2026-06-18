package com.projetologinbeatriz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String localizacao;

	private Integer quantidade;

	@OneToOne
	@JoinColumn(name = "id_produto", nullable = false)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Produto produto;

}