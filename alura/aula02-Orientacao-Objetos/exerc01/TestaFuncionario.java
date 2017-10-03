class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setSalario(1000.0);

		System.out.println(joao.getBonus());

		Gerente pedro = new Gerente();
		pedro.setSalario(2000.0);
		pedro.cobraEntrega();

		System.out.println(pedro.getBonus());

		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(pedro);

		System.out.println(totalizador.getTotal());
	}
}