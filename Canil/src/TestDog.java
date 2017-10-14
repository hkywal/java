
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
		
		pets[2] = new Dog();
		pets[2].setWeight(60.6);
		aux = pets.length + "\n";
		aux += "Memória: " + pets[2] + "\n";
		aux += pets[2].getWeight();
		
		System.out.println(aux);
		
		
	}
	
}
