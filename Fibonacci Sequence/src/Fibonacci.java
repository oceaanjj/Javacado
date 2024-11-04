class fibonacci_Sequence{
	int num1 = 0;
	int num2 = 1;
	int sum = 0;
	
	
	void sequence() {
		sum = num1 + num2;
		System.out.print(num1 + " ");
		num1 = num2;
		num2 = sum;
	}
}

public class Fibonacci {

	public static void main(String[] args) {
		fibonacci_Sequence f = new fibonacci_Sequence();
		
		for(int i = 0; i < 9; i++) {
			f.sequence();	
		}

	}

}