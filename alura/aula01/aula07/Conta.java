class Conta {
	int numero;
	static int increment = 1;
	Cliente titular;
	private double saldo;
	double limite;
	private boolean status;

	public Conta(int numero, double limite) {
		this.numero = numero;
		this.limite = limite;
	}

	public Conta(String nome) {
		titular = new Cliente();
		titular.nome = nome;
		this.numero = this.increment;
		this.increment++;
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

	public void showContaNumero() {
		System.out.println(titular.nome + " / " + this.numero);
	}

}

class Cliente {
	String nome;
	String endereco;
}