package br.com.fiap.model;

public class Endereco {

	private String cep;
	private String logradouro;
	private int num;
	private String complemento;
	private String bairro;

	public Endereco() {
		super();
	}

	public Endereco(String cep, String logradouro, int num, String complemento, String bairro) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.num = num;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + "]";
	}

}