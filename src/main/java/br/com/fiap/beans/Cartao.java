package br.com.fiap.beans;

public class Cartao {
	// Tipos de dados e atributos
	private String nome;
	private int numero;
	private String data;
	private int codigo;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Cartao() {
		super();
	}

	public Cartao(String nome, int numero, String data, int codigo) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.data = data;
		this.codigo = codigo;
	}

	// MÉTODO SET (ENTRADA)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// MÉTODO GET (SAÍDA)
	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getData() {
		return data;
	}

	public int getCodigo() {
		return codigo;
	}
	
	// MÉTODO TO STRING
	public String toString() {
		return "\nNome: " + getNome() + "\nNúmero: " + getNumero() + "\nData: " + getData()
				+ "\nCódigo: " + getCodigo();
	}
	
	// MÉTODO INDETIFICADOR
	public String identificar() { 
		return "INFORMAÇÕES DO CARTÃO";
	}
		
}
