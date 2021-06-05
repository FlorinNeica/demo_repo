package automation.first;

public class Test3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a + b;
		int prod = a * b;

		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "*" + b + "=" + prod);
	}
}
