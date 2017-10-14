
public class TestaFuncionario {
	
	public static void main(String[] args) {

		Desenvolvedor henrique = new Desenvolvedor();
		henrique.setSalario(10000.0);
		System.out.println(henrique.getBonus());
		
		Dba eurico = new Dba();
		eurico.setSalario(10000.0);
		
		Gerente pedro = new Gerente();
		pedro.setSalario(1000.0);
		pedro.cobraEntrega();
		System.out.println(pedro.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(pedro);
		totalizador.adiciona(henrique);
		totalizador.adiciona(eurico);
		System.out.println(totalizador.getTotal());
		
	}
	
}
