
public class TestDog {

	public static void main(String[] args) {
		
		String aux = "";
		Dog dog1 = new Dog();
		
		dog1.setBreed("Fila");
		dog1.setWeight(60.3);
		dog1.getBreed();
		dog1.getWeight();
		
		Dog[] pets;
		pets = new Dog[9];
		
		for (int y = 0; y < pets.length; y++) {
			pets[y] = new Dog();
		}
		pets[2].setWeight(60.6);
		pets[8].setBreed("Pastor");
		aux = pets.length + "\n";
		aux += "Memória: " + pets[2] + "\n";
		aux += pets[2].getWeight() + "\n";
		aux += pets[8].getWeight() + "\n";
		
		System.out.println(aux);
		
	}
	
}
