import java.util.Random;

public class CreateMatrix2D {
	private int numberOfColumnsAndRows;
	private int[][] arrMatrix;
	private int numberOfHeroes;
	private int numberOfEnemies;
	private int maxNumberOfEnemies = 2;
	private int maxNumberOfHeroes = 1;
	private int getRandomNumber;
	
	public void setNumberOfColumnsAndRows(int columnsAndRows) {
		this.numberOfColumnsAndRows = columnsAndRows;
	} 

	public int getNumberOfColumnsAndRows() {
		return this.numberOfColumnsAndRows;
	}

	public void createMatrix() {
		this.arrMatrix = new int[this.numberOfColumnsAndRows][this.numberOfColumnsAndRows];

		for (int line = 0; line < this.numberOfColumnsAndRows; line++) {
			for (int column = 0; column < this.numberOfColumnsAndRows; column++) {
				arrMatrix[line][column] = this.getRandomNumberGenerator();
			}
			System.out.println("******");
		}

		System.out.println("Matrix created whith " + this.arrMatrix.length + " columns and lines." );
	}

	public String plotMatrix() {
		String strPlotAux = "[";
		for (int x = 0; x < this.numberOfColumnsAndRows; x++) {
			for (int y = 0; y < this.numberOfColumnsAndRows; y++) {
				strPlotAux += + this.arrMatrix[x][y];
			}
			strPlotAux += ",";
		}
		strPlotAux += "]";

		return(strPlotAux);
	}

	private int getRandomNumberGenerator() {
		Random randomNumberGenerator = new Random();
		boolean findNumber = false;
		int randomNumber = randomNumberGenerator.nextInt(3);

		while (!findNumber) {		
			if (itsSpace(randomNumber)) {
				findNumber = true;
				System.out.println("randomNumber 1: " + randomNumber);
				return randomNumber;
			}
			if (itsHero(randomNumber) && !completeNumberOfHeroes()) {
				this.numberOfHeroes++;
				findNumber = true;
				System.out.println("randomNumber 2: " + randomNumber);
				return randomNumber;
			}
			if (itsEnemy(randomNumber) && !completeNumberOfEnemies()) {
				this.numberOfEnemies++;
				findNumber = true;
				System.out.println("randomNumber 3: " + randomNumber);
				return randomNumber;
			}
			randomNumber = randomNumberGenerator.nextInt(3);
		}
		System.out.println("randomNumber 4: " + randomNumber);
		return randomNumber;
	}

	private boolean itsSpace(int space) {
		return (space == 0) ? true : false;
	}

	private boolean itsHero(int hero) {
		return (hero == 1) ? true : false;
	}

	private boolean itsEnemy(int enemy) {
		return (enemy == 2) ? true : false;
	}

	private boolean completeNumberOfHeroes() {
		return (this.numberOfHeroes == this.maxNumberOfHeroes) ? true : false;
	}

	private boolean completeNumberOfEnemies() {
		return (this.numberOfEnemies > 0 && this.numberOfEnemies <= this.maxNumberOfEnemies) ? true : false;
	}


}