package week1.day1;

public class AmstrongNumber {

	public static void main(String[] args) {		
		int input =153; 
		int orgnumber= input;
		int output = 0;
		
		while (input>0) {
			int rem = input % 10;			
			output = output + (rem * rem * rem);
			input = input/ 10;
			System.out.println(input);
		}
		System.out.println(output);
		System.out.println(input);
		if (orgnumber == output) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}
}

