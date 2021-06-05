package automation.exceptions;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int age = Integer.parseInt(args[0]);
			// do something with age…
			System.out.println(age + 1);
		} catch (Throwable ex) {
			System.out.println("First argument needs to be an int. " + ex.getMessage());

		}

	}
}
