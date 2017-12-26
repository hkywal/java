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
		String strPlotAux = this.graphicLine(this.numberOfColumnsAndRows) + "\n";
		for (int x = 0; x < this.numberOfColumnsAndRows; x++) {
			strPlotAux += "   ";

			for (int y = 0; y < this.numberOfColumnsAndRows; y++) {
				strPlotAux += + this.arrMatrix[x][y] + "   ";
			}
			strPlotAux += "\n";

		}
		strPlotAux += this.graphicLine(this.numberOfColumnsAndRows) + "\n";

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
					message += (column + 1) + "," + (line + 1) + ").\n";
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
						int howManyStepsValue = howManySteps(line, column, this.heroCoordinateX, this.heroCoordinateY);
						message += (column + 1) + "," + (line + 1) + ").\n";
						
						message += "     O inimigo está " + leftOrRight ((column+1), (this.heroCoordinateY+1)) + " e " +  upOrDown ((line+1), (this.heroCoordinateX+1))  + "\n";
						message += "     O herói andará " + howManyStepsValue + " território" + this.showS(howManyStepsValue) + " para alcançá-lo.\n";
					
						message += "     Se for por outra dimensão o herói andará " + howManyStepsInOtherDimension (column + 1, this.heroCoordinateY + 1, line + 1, this.heroCoordinateX + 1) + " territórios para alcançá-lo.\n\n";

					} else {
						message += "  -> O segundo inimigo está nas coordenadas (" + (line + 1) + "," + (column + 1) + ").\n";
						line = 999;
						column = 999;
					}
					enemiesCounter++;
				}

			}
		}
		return message;
	}

	public int howManySteps(int enemieX, int enemieY, int heroX, int heroY) {
		int horizontal = Math.abs(enemieX - heroX);
		int vertical = Math.abs(enemieY - heroY);
		return horizontal + vertical;
	}

	public String howManyStepsInOtherDimension(int x1, int x2, int y1, int y2) {
		int possibility0 = Math.abs(this.numberOfColumnsAndRows - Math.abs(x1 - x2) + Math.abs(y1 - y2));
		int possibility1 = Math.abs(Math.abs(x1 - x2) + Math.abs((y1 + this.numberOfColumnsAndRows) - y2));
		int possibility2 = Math.abs(Math.abs((x1 + this.numberOfColumnsAndRows) - x2) + Math.abs(y1 - y2));

		if (x1 == x2) {
			possibility0 = Math.abs(this.numberOfColumnsAndRows - Math.abs(y1 - y2));
		}
		if (y1 == y2) {
			possibility0 = Math.abs(this.numberOfColumnsAndRows - Math.abs(x1 - x2));
		}

		possibility0 = Math.min(possibility0, possibility1);
		possibility0 = Math.min(possibility0, possibility2);
		return "" + possibility0;
	}

	public String leftOrRight(int enemieX, int heroX) {
		String position = "";
		int numberOfPositions =  Math.abs(enemieX - heroX); 

		if (enemieX > heroX) {
			position = numberOfPositions + " coluna" + this.showS(numberOfPositions) + " à direita";
		} else {
			position = numberOfPositions + " coluna" + this.showS(numberOfPositions) + " à esquerda";
		}
		if (enemieX == heroX) {
			position = "na mesma coluna";
		}

		return position;
	}

	public String upOrDown(int enemieY, int heroY) {
		String position = "";
		int numberOfPositions =  Math.abs(enemieY - heroY); 

		if (enemieY < heroY) {
			position = numberOfPositions + " linha" + this.showS(numberOfPositions) + " acima";
		} else {
			position = numberOfPositions + " linha" + this.showS(numberOfPositions) + " abaixo";
		}
		if (enemieY == heroY) {
			position = "na mesma linha";
		}

		return position + ".";
	}

	public String showS(int value) {
		return (value > 1) ? "s" : "";
	}

	public String graphicLine(int size) {
		String plot = "*";
		for (int x = 0; x < size; x++) {
			plot += "----";
		}
		return plot + "*";
	}

}