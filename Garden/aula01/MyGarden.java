package aula01;

import java.util.Scanner;

class MyGarden {

	public static void main(String args[]) {
		int numberOfPlants = 0;
		
		Scanner scanner = new Scanner(System.in);
		Utils utils = new Utils();		

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
		scanner.close();
	}

}
