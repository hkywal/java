class Conta {
	int numero;
	Pessoa titular;
	double saldo;
	int agencia;

	void deposita(double valorSerDepositado) {
		this.saldo += valorSerDepositado;
	}

	void saca(double valorSacado) {
		if (valorSacado < this.saldo) {
			this.saldo -= valorSacado;
		}
	}

	void transfere (double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}

}

class Pessoa {
	String nome;
	String cpf;
	String dataDeNascimento;
}

class Programa {
	
	public static void main(String[] args) {
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 500.0;
		mauricio.agencia = 842;

		mauricio.titular = new Pessoa();

		mauricio.titular.nome = "Mauricio";
		mauricio.titular.cpf = "752.167.8887";
		mauricio.titular.dataDeNascimento = "12/12/1970";
		//mauricio.deposita(1000.0);
		//mauricio.saca(1000.0);

		Conta guilherme = new Conta();
		guilherme.numero = 456;
		guilherme.saldo = 900.0;

		//guilherme.deposita(1000.0);

		mauricio.transfere(400.0, guilherme);
	
		System.out.println(mauricio.titular.nome);
		System.out.println(mauricio.titular.cpf);
		System.out.println(mauricio.saldo);
		System.out.println(guilherme.saldo);

	}

}
