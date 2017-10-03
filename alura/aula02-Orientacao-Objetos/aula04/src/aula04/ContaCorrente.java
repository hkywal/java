package aula04;

public class ContaCorrente {
	
	private String nome;
	private int conta;
	private double saldo;

	public ContaCorrente(String nome, int conta, double saldo) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.conta);
		System.out.println(this.saldo);
	}

	public void setDesconto(double valor) {
		this.saldo -= valor;
	}
}
