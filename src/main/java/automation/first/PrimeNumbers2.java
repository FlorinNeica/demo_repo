package automation.first;

import java.util.Scanner;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		String primeNumbers = "";
		boolean isPrime = true;
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		input.close();
		System.out.println("Prime numbers: ");

		for (int i = 2; i < n; i++) {

			isPrime = true;

			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime)
				System.out.print(" " + i);
		}
	}
}