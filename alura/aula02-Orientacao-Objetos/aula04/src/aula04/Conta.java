package aula04;

public class Conta {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente("mauricio", 123, 450.0);
		contaCorrente.setNome("João");
		contaCorrente.setConta(123);
		contaCorrente.imprime();
		contaCorrente.setDesconto(100.0);
		contaCorrente.imprime();
	}
	
	
}
