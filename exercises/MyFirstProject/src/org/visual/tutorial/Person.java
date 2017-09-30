package org.visual.tutorial;

public class Person {
	private String nome;
	private int maxBooks;
	
	public Person() {
		nome = "Oi nome";
		maxBooks = 3;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String qualquerNome) {
		nome = qualquerNome;
	}

	public int getMaxBooks() {
		return maxBooks;
	}

	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}
	
}
