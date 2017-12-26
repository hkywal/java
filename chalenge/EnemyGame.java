import java.util.Scanner;

class EnemyGame {

	public static void main(String args[]) {

		CreateMatrix2D cm2d = new CreateMatrix2D();
		Scanner scanner = new Scanner(System.in);

		boolean isNumeric = true;

		System.out.println("Infomre o tamnanho da matrix maior que 2 e menor que 10:");
		String matrixSize = scanner.next();

		try {
            Double num = Double.parseDouble(matrixSize);
        } catch (NumberFormatException e) {
            isNumeric = false;
        }

		if (isNumeric && Integer.parseInt(matrixSize) > 2 && Integer.parseInt(matrixSize) < 9) {
			cm2d.setNumberOfColumnsAndRows(Integer.parseInt(matrixSize));
			cm2d.createMatrix();
			System.out.println(cm2d.plotMatrix());

			System.out.println("\n* Onde se encontra o nosso herói?");
			System.out.println(cm2d.findTheHero());

			System.out.println("* Onde se encontram os seus inimigos?");
			System.out.println(cm2d.findTheEnemies());
		} else {
			System.out.println("Valor inválido!");
		}
	}

}