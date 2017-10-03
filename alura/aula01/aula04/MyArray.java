class MyArray {

	Numbers num;

	public static void main(String[] args) {

		MyArray arr1 = new MyArray();
		arr1.num = new Numbers(); 

		System.out.println("O tamanho do meu array é " + arr1.num.myNumbers.length);

		arr1.num.setValueAtPosition(12, 5);
		arr1.num.setValueAtPosition(22, 1);
		arr1.num.setValueAtPosition(230, 3);
		arr1.num.showValue(5);
		arr1.num.showValue(1);
		arr1.num.setValueAtPosition(9, 1);
		arr1.num.showValue(1);
		arr1.num.printArray();
	}

}


class Numbers {

	int[] myNumbers = new int[10];

	void setValueAtPosition(int value, int position) {
		this.myNumbers[position] = value;
	}

	void showValue(int position) {
		System.out.println("O valor na posicao " + position + " é " + this.myNumbers[position] + ".");
	}

	void printArray() {
		for (int i = 0; i < this.myNumbers.length; i++) {
			System.out.println("O valor na posicão " + i + " é igual a " + this.myNumbers[i]);
			if (this.myNumbers[i] > 100) {
				i = this.myNumbers.length;
			}
		}
	}

}
