package br.com.fiap.beans;

public class Servico {
	private int id;
	private String nome;

	public Servico() {
		super();
	}

	public Servico(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
