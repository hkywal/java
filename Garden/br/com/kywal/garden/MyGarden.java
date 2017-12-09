package br.com.kywal.garden;

import br.com.kywal.utils.Utilities;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

class MyGarden {

	public static void main(String args[]) {
		int numberOfPlants = 0;

		Date data = new Date();
		LocalDateTime locDate = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String text = locDate.format(formatter);
		LocalDateTime parseDate = LocalDateTime.parse(text, formatter);

		Locale ptBr = new Locale("pt", "BR");
		Locale vmLocale = Locale.getDefault();

		System.out.println("A data é " + data);
		System.out.println("A locDate é " + locDate);
		//System.out.println("Dia da semana " + locDate.getDayOfWeek);
		System.out.println("vmLocale " + ptBr);
		System.out.println("text " + text);
		
		Utilities utils = new Utilities();	

		Scanner scanner = new Scanner(System.in);

		String labelPlural = "s";
		if (numberOfPlants < 2) {
			labelPlural = "planta";
		}
		
		System.out.println("Informe o nome da planta:");

		Specie bamboo = new Specie();
		bamboo.setName(new String("Bamboo"));
		
		Plant pt = new Plant();
		String txtScanner = scanner.next();
		pt.setName(txtScanner);

		System.out.println("Informe o código da planta:");
		txtScanner = scanner.next();
		pt.setCode(txtScanner);

		pt.setSpecie(bamboo);

		System.out.println("O nome da planta é " + pt.getName() + " e seu código é " + pt.getCode() + " e sua espécie é " + pt.getSpecie().getName());

		



		// if (utils.isNumeric(txtScanner)) {
		// 	numberOfPlants = Integer.parseInt(txtScanner);
		// 	if (numberOfPlants > 0) {
		// 		String textPlant = "Eu tenho " + utils.testPlural("planta", numberOfPlants);
		// 		System.out.println("This is my garden.\n" + textPlant);
		// 	} else {
		// 		System.out.println("Não tenho plantas.");
		// 	}
		// } else {
		// 	System.out.println("Não é um número");
		// }
		
		// System.out.println("\nInforme o número de rosas:");
		// txtScanner = scanner.next();
		// int firstValue = Integer.parseInt(txtScanner);

		// System.out.println("\nInforme o número da divisão:");
		// txtScanner = scanner.next();
		// int secondValue = Integer.parseInt(txtScanner);
		
		// System.out.println("Oresultado da divisão é " + (firstValue/secondValue));

		scanner.close();

	}

}
