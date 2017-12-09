package br.com.kywal.garden;

public class Plant {
	private String name;
	private String code;
	private String color;
	private Specie specie;

	public void setName(String stName) {
		this.name = stName;
	}

	public String getName() {
		return this.name;
	}

	public void setCode(String stCode) {
		this.code = stCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setSpecie(Specie specie) {
		this.specie = specie;
	}

	public Specie getSpecie() {
		return this.specie;
	}

	public String getSpecieName() {
		return this.specie.getName();
	}
}
