
abstract class Conta {

	private double saldo;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void imprimeExtrato();
	
}
