
public class Example2 {
	int var1; 
	int var2;
	double var3;
	
	public void callIntNumber() {	
		var1 = 1024;
		System.out.println("The int number var1 is " + var1);
	}
	
	public void callHalfValueNumber() {
		var2 = var1 / 2;
		System.out.println("The half value of var1 is " + var2);		
	}
	
	public void callDoubleValueNumber() {
		var1 = 10;
		var3 = 10.0;
		System.out.println("The double value of var1/4 is " + (var1 / 4));	
		System.out.println("The double value of var3/4 is " + (var3 / 4));
	}

}
