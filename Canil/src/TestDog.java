
public class TestDog {

	public static void main(String[] args) {
		
		String aux = "";
		Fila dog1 = new Fila();
		
		dog1.setBreed("Fila");
		dog1.setWeight(60.3);
		dog1.getBreed();
		dog1.getWeight();
		
		Fila[] pets;
		pets = new Fila[9];
		
		for (int y = 0; y < pets.length; y++) {
			pets[y] = new Fila();
		}
		pets[8].setWeight(60.6);
		pets[8].setBreed("Pastor");
		
		aux = pets.length + "\n";
		aux += "Memória: " + pets[2] + "\n";
		aux += pets[2].getWeight() + "\n";
		aux += pets[8].getWeight() + "\n";
		aux += pets[8].getFoodQuantity() + "\n";

		
		System.out.println(aux);
		
		
		
		
	}
	
}
