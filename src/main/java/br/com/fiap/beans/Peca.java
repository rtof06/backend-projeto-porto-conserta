package br.com.fiap.beans;

public class Peca {
	// Tipos de dados e atributos
	private int codigo;
	private String nome;
	private double preco;
	private String marca;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Peca() {
		super();
	}

	public Peca(int codigo, String nome, double preco, String marca) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	// MÉTODO SET (ENTRADA)
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// MÉTODO GET (SAÍDA)
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getMarca() {
		return marca;
	}

	// MÉTODO TO STRING
	public String toString() {
		return "\nCódigo: " + getCodigo() + "\nNome: " + getNome() + "\nPreço: " + getPreco() + "\nMarca: "
				+ getMarca();
	}

	// MÉTODO IDENTIFICADOR
	public String identificar() {
		return "INFORMAÇÕES DA PEÇA";
	}
}
