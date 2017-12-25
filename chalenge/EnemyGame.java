class EnemyGame {

	public static void main(String args[]) {

		CreateMatrix2D cm2d = new CreateMatrix2D();

		cm2d.setNumberOfColumnsAndRows(5);
		cm2d.createMatrix();
		System.out.println(cm2d.plotMatrix());

		System.out.println("\n* Onde se encontra o nosso herói?");
		System.out.println(cm2d.findTheHero());

		System.out.println("* Onde se encontram os seus inimigos?");
		System.out.println(cm2d.findTheEnemies());

	}

}