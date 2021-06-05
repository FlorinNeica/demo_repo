package automation.first;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to see all the prime numbers before it: ");
		int lastnumber = input.nextInt();
		int number = 0;
		input.close();
		String primeNumbers = "";
		for (int i = 1; i < lastnumber; i++) {
			int counter = 0;
			for (number = i; number >= 1; number--) {
				if (i % number == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + "  ";
			}
		}
		System.out.println("Prime numbers");
		System.out.println(primeNumbers);
	}
}
