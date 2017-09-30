class AlgumaClasse {

	public static void main(String[] args) {

		Argumento arg1 = new Argumento();
		Idade idade1 = new Idade();

		arg1.imprimirArgumentos(args);

		idade1.setIncremento(2);
		idade1.criarArrayIdade(10);
		idade1.imprimirIdade();

		Empresa empr1 = new Empresa();
		empr1.funcionarios = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		empr1.adicionar(f1, args[0], 123456);
		empr1.imprime();

		System.out.println("O nome é " + empr1.funcionarios[0].nome);

	}

}

class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;

	void adicionar(Funcionario f, String nome, int matricula) {
		f.nome = nome;
		f.matricula = matricula;
		this.funcionarios[this.livre] = f;
		this.livre++;
	}

	void imprime() {
		System.out.println("O tamanho de funcionarios é " + funcionarios.length);
	}

}

class Funcionario {
	String nome;
	int matricula;
}

class Argumento {
	void imprimirArgumentos(String[] args) {
		System.out.println("O número de argumentos é " + args.length);
		if (args.length > 0) {
			for (int x = 0; x < args.length; x++) {
				System.out.println("O argumento " + (x + 1) + " é " + args[x]);
			}
		}
	}
}

class Idade {
	int incremento;
	int[] idades;

	void setIncremento(int valorDoIncremento) {
		this.incremento = valorDoIncremento;
	}

	void imprimirIdade() {
		for (int i = 0; i < this.idades.length; i++) {
			System.out.println("O valor do incremento é " + this.incremento + " e a idade é " + this.idades[i]);
		}
	}

	void criarArrayIdade(int size) {
		this.idades = new int[size];

		for (int i = 0; i < size; i++) {
			this.idades[i] = i + this.incremento;
		}
	}

}