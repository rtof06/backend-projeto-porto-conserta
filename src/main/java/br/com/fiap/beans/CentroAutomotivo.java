package br.com.fiap.beans;

public class CentroAutomotivo {
	private int id;
	private String name;
	private String neighbourhood;
	private String street;
	private String phone;
	private String uf;
	private String city;
	private String atendimento;

	public CentroAutomotivo() {
		super();
	}

	public CentroAutomotivo(int id, String name, String neighbourhood, String street, String phone, String uf,
			String city, String atendimento) {
		super();
		this.id = id;
		this.name = name;
		this.neighbourhood = neighbourhood;
		this.street = street;
		this.phone = phone;
		this.uf = uf;
		this.city = city;
		this.atendimento = atendimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(String atendimento) {
		this.atendimento = atendimento;
	}

}
