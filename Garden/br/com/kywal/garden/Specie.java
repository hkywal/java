package br.com.kywal.garden;

public class Specie {
	private String name;
	private String code;
	private SubSpecie subSpecie;

	public void setName(String stName) {
		this.name = stName; 
	}

	public String getName() {
		return this.name;
	}

	public void setSubSpecie(SubSpecie subSpecie) {
		this.subSpecie = subSpecie;
	}

	public SubSpecie getSubSpecie() {
		return this.subSpecie;
	}

	public String getSubSpecieName() {
		return this.subSpecie.getName();
	}

} 

