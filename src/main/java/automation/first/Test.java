package automation.first;

public class Test {

	public static void main(String[] args) {

		int sum = 0;
		boolean isOddNr;

		for (int n = 1; n < 100; n++) {
			sum += n;
		}
		System.out.println(sum);
		isOddNr = OddNumbers.isOddNumber(sum);
		System.out.println(isOddNr);
	}
}
