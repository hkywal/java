class TesteModificador {
	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.numero = 123;
		joao.setActive(true);

		joao.deposita(500.0);
		joao.saca(400.0);

		System.out.println(joao.showSaldo() + " e a conta está " + joao.isActive());
	}
}