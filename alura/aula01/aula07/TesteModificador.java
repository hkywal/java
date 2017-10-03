class TesteModificador {
	public static void main(String[] args) {

		Conta joao = new Conta("João");
		Conta jose = new Conta("José");
		joao.showContaNumero();
		jose.showContaNumero();
		//joao.setActive(true);

		//joao.deposita(500.0);
		//joao.saca(400.0);

		//System.out.println(joao.showSaldo() + " e a conta de número " + joao.numero + ", está " + joao.isActive() + ".");
	
	}
}