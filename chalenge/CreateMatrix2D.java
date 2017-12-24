public class CreateMatrix2D {
	private int numberOfColumnsAndRows;
	private int[][] arrMatrix;
	
	public void setNumberOfColumnsAndRows(int columnsAndRows) {
		this.numberOfColumnsAndRows = columnsAndRows;
	} 

	public int getNumberOfColumnsAndRows() {
		return this.numberOfColumnsAndRows;
	}

	public void createMatrix() {
		this.arrMatrix = new int[this.numberOfColumnsAndRows][this.numberOfColumnsAndRows];
		System.out.println("Matrix created whith " + this.arrMatrix.length + " columns and lines." );
	}

	public void plotMatrix() {
		String strPlotAux = "[";
		for (int i = 0; i < this.numberOfColumnsAndRows; i++) {
			strPlotAux += + this.arrMatrix[0][i];
		}
		System.out.println(strPlotAux);
	}

}