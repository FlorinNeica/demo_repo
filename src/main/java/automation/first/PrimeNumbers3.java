package automation.first;

import java.util.Scanner;

public class PrimeNumbers3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to see all the prime numbers before it: ");
		int lastnumber = input.nextInt();
		input.close();
		boolean isPrime = true;
		System.out.println("Prime numbers: ");

		for (int i = 2; i < lastnumber; i++) {

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
