package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 15;
		int flag = 0;
		if (input==0 || input == 1) {
			System.out.println("It's a not Prime Number");
		} 
		else {
			for(int i = 2; i <= input/2; i++) {
				if (input%i == 0) {
					System.out.println("It's a not Prime Number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("It's a Prime Number");
			}
		}
	}

}
