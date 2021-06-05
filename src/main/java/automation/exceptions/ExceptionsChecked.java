package automation.exceptions;

public class ExceptionsChecked {

	public static void main(String[] args) throws Exception {
		System.out.println(circleArea(10));
	}

	public static double circleArea(double radius) throws Exception {
		if (radius < 0) {
			throw new Exception("radius should be positive");
		}
		return Math.PI * radius * radius;
	}

}
