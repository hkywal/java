
abstract class Dog {
	private String breed;
	protected double weight;
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void getBreed() {
		System.out.println(this.breed);
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public abstract double getWeight();
	
	public String getFoodQuantity() {
		String message;
		if (this.weight >= 60.0) {
			message = "Dar muita ração.";
		} else if (this.weight > 30) {
			message = "Dar média quantidade de ração.";
		} else {
			message = "Dar pouca ração.";
		}
		return message;
	}
	
}
 