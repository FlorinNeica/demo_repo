package automation.first;

import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input a year between 1900-2016: ");
		int year = input.nextInt();
		int numberOfDays = 0;
		input.close();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			numberOfDays = 29;
		} else {
			numberOfDays = 28;
		}
		System.out.println("February has " + numberOfDays + " days!");
	}

}
