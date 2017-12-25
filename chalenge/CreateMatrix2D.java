import java.util.Random;

public class CreateMatrix2D {
	private int numberOfColumnsAndRows;
	private int[][] arrMatrix;
	private int numberOfHeroes;
	private int numberOfEnemies;
	private int maxNumberOfEnemies = 2;
	private int maxNumberOfHeroes = 1;
	private int getRandomNumber;
	private int heroCoordinateX;
	private int heroCoordinateY;
	
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
				arrMatrix[line][column] = 0;
			}
		}
		this.createHero();
		this.createEnemy();
		this.createEnemy();

		System.out.println("\n###############################" );
		System.out.println("\n   B L A D E   R U N N E R \n" );
		System.out.println("###############################\n" );
		System.out.println("Matrix created whith " + this.arrMatrix.length + " columns and lines." );
	}

	public String plotMatrix_() {
		String strPlotAux = "[";
		for (int x = 0; x < this.numberOfColumnsAndRows; x++) {
			strPlotAux += "\"";
			for (int y = 0; y < this.numberOfColumnsAndRows; y++) {
				strPlotAux += + this.arrMatrix[x][y];
			}
			strPlotAux += "\"";
			if (x < this.numberOfColumnsAndRows - 1) {
				strPlotAux += ",";
			}
		}
		strPlotAux += "]";

		return(strPlotAux);
	}

	public String plotMatrix() {
		String strPlotAux = "*---------------*\n";
		for (int x = 0; x < this.numberOfColumnsAndRows; x++) {
			strPlotAux += "  ";

			for (int y = 0; y < this.numberOfColumnsAndRows; y++) {
				strPlotAux += + this.arrMatrix[x][y] + "   ";
			}
			strPlotAux += "\n";

		}
		strPlotAux += "*---------------*\n";

		return(strPlotAux);
	}


	private int getRandomNumberGenerator() {
		return 0;
	}

	private void createHero() {
		Random randomNumberGenerator = new Random();
		int randomNumberX = randomNumberGenerator.nextInt(this.numberOfColumnsAndRows);
		int randomNumberY = randomNumberGenerator.nextInt(this.numberOfColumnsAndRows);
		this.arrMatrix[randomNumberX][randomNumberY] = 1;
	}

	private void createEnemy() {
		Random randomNumberGenerator = new Random();
		int randomNumberX = randomNumberGenerator.nextInt(this.numberOfColumnsAndRows);
		int randomNumberY = randomNumberGenerator.nextInt(this.numberOfColumnsAndRows);
		if (this.isFilled(randomNumberX, randomNumberY)) {
			createEnemy();
		} else {
			this.arrMatrix[randomNumberX][randomNumberY] = 2;
		}
	}

	private boolean isFilled(int x, int y) {
		return (this.arrMatrix[x][y] == 0) ? false : true;
	}

	public String findTheHero() {
		String message = "  -> Ele está nas coordenadas (";
		for (int line = 0; line < this.numberOfColumnsAndRows; line++) {
			for (int column = 0; column < this.numberOfColumnsAndRows; column++) {
				if (arrMatrix[line][column] == 1) {
					message += (column + 1) + ", " + (line + 1) + ").\n";
					this.heroCoordinateX = line; 
					this.heroCoordinateY = column; 
					line = 999; 
					column = 999;
				}
			}
		}
		return message;
	}

	public String findTheEnemies() {
		String message = "  -> O primeiro está nas coordenadas (";
		int enemiesCounter = 0;
		int nemLine = 0;
		int newColumn = 0;
		for (int line = 0; line < this.numberOfColumnsAndRows; line++) {
			for (int column = 0; column < this.numberOfColumnsAndRows; column++) {
				if (arrMatrix[line][column] == 2) {
					if (enemiesCounter == 0) {
						message += (column + 1) + ", " + (line + 1) + ").\n";
						
						message += "     O inimigo está " + leftOrRight ((column+1), (this.heroCoordinateY+1)) + "\n";
						message += "     O herói andará " + howManySteps (line, column, this.heroCoordinateX, this.heroCoordinateY) + " territórios para alcançá-lo.\n";
						

						message += "     Se for por outra dimensão o herói andará " + howManyStepsInOtherDimension (line, column, this.heroCoordinateX, this.heroCoordinateY) + " territórios para alcançá-lo. this.heroCoordinateX:" + this.heroCoordinateX/2 + "\n\n";
						


					} else {
						message += "  -> O segundo está nas coordenadas de Linha:" + (line + 1) + " e Coluna:" + (column + 1) + ".\n";
						line = 999;
						column = 999;
					}
					enemiesCounter++;
				}

			}
		}
		return message;
	}

	public String howManySteps(int enemieX, int enemieY, int heroX, int heroY) {
		int horizontal = Math.abs(enemieX - heroX);
		int vertical = Math.abs(enemieY - heroY);
		return "" + (horizontal + vertical);
	}

	public String howManyStepsInOtherDimension(int enemieX, int enemieY, int heroX, int heroY) {
		int horizontal = Math.abs(enemieX - heroX);
		int vertical = Math.abs((enemieY + this.numberOfColumnsAndRows) - heroY);
		return "" + (horizontal + vertical);
	}

	public String leftOrRight(int enemieX, int heroX) {
		String position = "";
		String strS = "s";
		int numberOfPositions =  Math.abs(enemieX - heroX); 

		if (numberOfPositions == 1) {
			strS = "";
		} 

		if (enemieX > heroX) {
			position = numberOfPositions + " coluna" + strS + " à direita";
		} else {
			position = numberOfPositions + " coluna" + strS + " à esquerda";
		}
		if (enemieX == heroX) {
			position = "na mesma coluna";
		}

		return position + ".";
	}

}