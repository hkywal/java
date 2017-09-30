class Funcionario {
	String nome;
	String departamento;
	double salario;
	String rg;
	Data dataDeEntrada;

	void recebeAumento(double value) {
		this.salario += value;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}	

	void show() {
		System.out.println ("O salário final é " + this.salario);
		System.out.println ("A data de entrada foi " + this.dataDeEntrada.showData());
	}

	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario();
		funcionario01.dataDeEntrada = new Data();

		funcionario01.dataDeEntrada.preencheData(10, 5, 2017);

		funcionario01.salario = 10000.0;
		funcionario01.recebeAumento(5000.0);

		funcionario01.show();
	}
}


class Data {
	int dia;
	int mes;
	int ano;

	void preencheData (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String showData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}