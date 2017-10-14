package aula04;

public class Conta {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente("mauricio", 123, 450.0);
		contaCorrente.setNome("João");
		contaCorrente.setConta(123);
		contaCorrente.imprime();
		contaCorrente.setDesconto(100.0);
		contaCorrente.imprime();

		ContaCorrente contaCorrente2 = new ContaCorrente("joao", 123, 234.9);

		contaCorrente2.setNome("Maria");
		contaCorrente2.imprime();
		
		MinhaClasse myClass = new MinhaClasse();
		myClass.setNumberValue(2000);
		myClass.showNumber();
	}

}
