package automation.first;

public class OddNumbers {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {

			int valueToEvaluate = Integer.parseInt(args[i]);

			boolean isOddNr = isOddNumber(valueToEvaluate);

			System.out.println("Is number " + valueToEvaluate + " odd? " + isOddNr);
		}
	}

	public static boolean isOddNumber(int number) {
		boolean result = false;

		if (number % 2 == 0) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}
}
