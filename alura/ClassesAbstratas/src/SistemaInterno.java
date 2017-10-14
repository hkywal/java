
public class SistemaInterno {
	
	public void autentica(FuncionarioAutenticavel f) {
		int password = 123;
		
		if (f.autentica(password) == true) {
			System.out.println("Bem-vindo ao sistema!");
		} else {
			System.out.println("Senha incoreta!");
		}
		
	}
	
}
