package aula01;

import java.util.Scanner;

class MyGarden {

	public static void main(String args[]) {
		int numberOfPlants = 0;
		
		Utilities utils = new Utilities();		
		Scanner scanner = new Scanner(System.in);

		String labelPlural = "s";
		if (numberOfPlants < 2) {
			labelPlural = "planta";
		}
		
		System.out.println("Informe o número de pantas:");
		
		String txtScanner = scanner.next();

		if (utils.isNumeric(txtScanner)) {
			numberOfPlants = Integer.parseInt(txtScanner);
			if (numberOfPlants > 0) {
				String textPlant = "Eu tenho " + utils.testPlural("planta", numberOfPlants);
				System.out.println("This is my garden.\n" + textPlant);
			} else {
				System.out.println("Não tenho plantas.");
			}
		} else {
			System.out.println("Não é um número");
		}
		
		System.out.println("\nInforme o número de rosas:");
		txtScanner = scanner.next();
		int firstValue = Integer.parseInt(txtScanner);

		System.out.println("\nInforme o número da divisão:");
		txtScanner = scanner.next();
		int secondValue = Integer.parseInt(txtScanner);
		
		System.out.println("Oresultado da divisão é " + (firstValue/secondValue));
		scanner.close();

	}

}
