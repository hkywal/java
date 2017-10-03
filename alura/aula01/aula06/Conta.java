class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	double limite;
	private boolean status;

	public Conta(int numero, double limite) {
		this.numero = numero;
		this.limite = limite;
	}

	public Conta() {

	}

	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			this.saldo -= valor;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double showSaldo() {
		return this.saldo;
	}

	public void setActive(boolean status) {
		this.status = status;
	}

	public boolean isActive() {
		return this.status;
	}

}

class Cliente {
	String nome;
	String endereco;
}