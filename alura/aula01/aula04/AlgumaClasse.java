import java.util.Random;

class AlgumaClasse {

	public static void main(String[] args) {

		Argumento arg1 = new Argumento();
		Idade idade1 = new Idade();
		Randomico rand1 = new Randomico();

		arg1.imprimirArgumentos(args);

		idade1.setIncremento(2);
		idade1.criarArrayIdade(10);
		idade1.imprimirIdade();

		Empresa empr1 = new Empresa();
		empr1.funcionarios = new Funcionario[10];
		
		for (int i = 0; i <= 5; i++) {
			Funcionario f = new Funcionario();
			empr1.adicionar(f, "Func" + rand1.randomize(18), rand1.randomizeFloat(), rand1.randomizeBoolean());
		}

		empr1.imprime();

		empr1.mostraEmpregados();
	
	}

}

class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;

	void adicionar(Funcionario f, String nome, float matricula, boolean status) {
		f.nome = nome;
		f.matricula = matricula;
		f.status = status;
		this.funcionarios[this.livre] = f;
		this.livre++;
	}

	void imprime() {
		System.out.println("O tamanho de funcionarios é " + funcionarios.length);
	}

	void mostraEmpregados() {
		String saoFuncionarios = "";
		String naoSaoFuncionarios = "";

		for (int x = 0; x < this.funcionarios.length; x++) {
			if (this.funcionarios[x] != null) {
				String resposta = "Empreagado " + this.funcionarios[x].nome;
				resposta += " | Matricula " + this.funcionarios[x].matricula;
				resposta += " | Status " + this.funcionarios[x].status + "\n";
				if (this.funcionarios[x].status) {
					saoFuncionarios += resposta;
				} else {
					naoSaoFuncionarios += resposta;
				}
				
			}
			System.out.println("> FUNCIONÁRIOS\n***************\n" + saoFuncionarios + "\n\n> NÃO SÃO FUNCIONÁRIOS\n" + naoSaoFuncionarios);
		}
	}

}

class Funcionario {
	String nome;
	float matricula;
	boolean status;
}

class Randomico {
	int randomize(int range) {
		Random generator = new Random();
		return generator.nextInt(range);
	} 

	double randomizeGaussian() {
		Random generator = new Random();
		return generator.nextGaussian();
	} 

	float randomizeFloat() {
		Random generator = new Random();
		return generator.nextFloat() * 90;
	} 

	boolean randomizeBoolean() {
		Random generator = new Random();
		return generator.nextBoolean();
	} 

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