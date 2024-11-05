package br.com.fiap.beans;

public class Contato {
	// Tipos de dados e atributos
	private String email;
	private String telefone;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Contato() {
		super();
	}

	public Contato(String email, String telefone) {
		super();
		this.email = email;
		this.telefone = telefone;
	}

	// MÉTODO SET (ENTRADA)
	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// MÉTODO GET (SAÍDA)
	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	// MÉTODO TO STRING
	public String toString() {
		return "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone();
	}

}
