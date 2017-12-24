class EnemyGame {

	public static void main(String args[]) {

		CreateMatrix2D cm2d = new CreateMatrix2D();

		cm2d.setNumberOfColumnsAndRows(4);
		System.out.println(cm2d.getNumberOfColumnsAndRows());
		cm2d.createMatrix();
		System.out.println(cm2d.plotMatrix());

	}

}