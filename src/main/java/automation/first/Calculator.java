package automation.first;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number:");
		double number1 = input.nextDouble();
		System.out.print("Enter second number:");
		double number2 = input.nextDouble();
		System.out.print("Enter operator +, -, *, / : ");
		char operator = input.next()
				.charAt(0);

		input.close();

		double result = 0.0;

		switch (operator) {

		case '+':
			result = number1 + number2;
			break;

		case '-':
			result = number1 - number2;
			break;

		case '/':
			result = number1 / number2;
			break;

		case '*':
			result = number1 * number2;
			break;

		default:
			System.out.println("Error! Operator must be +, -, *, /");
			return;
		}
		System.out.println("Result is: " + result);
	}

}