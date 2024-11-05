package br.com.fiap.beans;

import br.com.fiap.model.Endereco;

public class DistribuidoraPeca {
	// Tipos de dados e atributo
	private String nome;
	private String unidade;
	private Endereco endereco;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public DistribuidoraPeca() {
		super();
	}

	public DistribuidoraPeca(String nome, String unidade) {
		super();
		this.nome = nome;
		this.unidade = unidade;
	}

	// MÉTODO SET (ENTRADA)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	// MÉTODO GET (SAÍDA)
	public String getNome() {
		return nome;
	}

	public String getUnidade() {
		return unidade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	// MÉTODO TO STRING
	public String toString() {
		return "\nNome: " + getNome() + "\nUnidade: " + getUnidade();
	}

}
