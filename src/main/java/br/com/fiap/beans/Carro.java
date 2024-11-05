package br.com.fiap.beans;

public class Carro {
	// Tipos de dados e atributos
	private String modelo;
	private String marca;
	private int ano;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Carro() {
		super();
	}

	public Carro(String modelo, String marca, int ano) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	// MÉTODO SET (ENTRADA)
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// MÉTODO GET (SAÍDA)
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	// MÉTODO TO STRING
	public String toString() {
		return "\nModelo: " + getModelo() + "\nMarca: " + getMarca() + "\nAno: " + getAno();
	}

	// MÉTODO IDENTIFICADOR
	public String identificar() {
		return "INFORMAÇÕES DO CARRO";
	}

}
