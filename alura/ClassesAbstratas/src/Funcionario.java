
abstract class Funcionario {
	private String nome;
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	abstract double getBonus();
	
	public String getNome() {
		return nome;
	}

}
