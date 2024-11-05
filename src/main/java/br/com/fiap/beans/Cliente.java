package br.com.fiap.beans;

public class Cliente {
	// Tipos de dados e atributos
	private int cod_cliente;
	private String nome;
	private String sobrenome;
	private int idade;
	private String email;
	private String telefone;
	private int num_logradouro;
	private String comp_logradouro;
	private String password;

	public Cliente() {
		super();
	}

	public Cliente(int cod_cliente, String nome, String sobrenome, int idade, String email, String telefone,
			int num_logradouro, String comp_logradouro, String password) {
		super();
		this.cod_cliente = cod_cliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.num_logradouro = num_logradouro;
		this.comp_logradouro = comp_logradouro;
		this.password = password;
	}

	public int getCodigo() {
		return cod_cliente;
	}

	public void setCodigo(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getNumLogradouro() {
		return num_logradouro;
	}

	public void setNumLogradouro(int num_logradouro) {
		this.num_logradouro = num_logradouro;
	}

	public String getCompLogradouro() {
		return comp_logradouro;
	}

	public void setCompLogradouro(String comp_logradouro) {
		this.comp_logradouro = comp_logradouro;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}