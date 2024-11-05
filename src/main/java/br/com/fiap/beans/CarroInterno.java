package br.com.fiap.beans;

public class CarroInterno {
	// Tipos de dados e atributos
	private boolean direcaoHidraulica;
	private boolean arCondicionado;
	private boolean multimidia;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public CarroInterno() {
		super();
	}

	public CarroInterno(boolean direcaoHidraulica, boolean arCondicionado, boolean multimidia) {
		super();
		this.direcaoHidraulica = direcaoHidraulica;
		this.arCondicionado = arCondicionado;
		this.multimidia = multimidia;
	}

	// MÉTODO SET (ENTRADA)
	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public void setMultimidia(boolean multimidia) {
		this.multimidia = multimidia;
	}

	// MÉTODO GET (SAÍDA)
	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public boolean isMultimidia() {
		return multimidia;
	}

	// MÉTODO TO STRING
	public String toString() {
		return "\nDireção Hidraulica: " + isDirecaoHidraulica() + "\nAr Condiciado: " + isArCondicionado()
				+ "\nMultimídia: " + isMultimidia();
	}

}
