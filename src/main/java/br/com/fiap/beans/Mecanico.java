package br.com.fiap.beans;

import br.com.fiap.model.Endereco;

public class Mecanico {
	// Tipos de dados e atributos
	private int codigo;
	private String nome;
	private String sobrenome;
	private int idade;
	private String cpf;
	private Endereco endereco;
	private Contato contato;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Mecanico() {
		super();
	}

	public Mecanico(int codigo, String nome, String sobrenome, int idade, String cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
	}

	// MÉTODO SET (ENTRADA)
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	// MÉTODO GET (SAÍDA)
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Contato getContato() {
		return contato;
	}

	// MÉTODO TO STRING
	public String toString() {
		return "\nCódigo: " + getCodigo() + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nIdade: "
				+ getIdade() + "\nCPF: " + getCpf();
	}

	// MÉTODO IDENTIFICADOR
	public String identificar() {
		return "INFORMAÇÕES DO MECÂNICO";
	}

}
