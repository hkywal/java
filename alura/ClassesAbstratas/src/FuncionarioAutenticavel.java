
public abstract class FuncionarioAutenticavel extends Funcionario {
	
	private int senha;

	public boolean autentica(int senha) {
		return this.senha == senha;
	}

}
