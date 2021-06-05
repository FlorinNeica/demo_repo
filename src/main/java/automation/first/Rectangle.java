package automation.first;

/**
 * @author ionel
 *
 */
public class Rectangle {

	public static void main(String[] args) {

		// drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		// drawShapeOutline(4, 5);

		// drawShapeCorners(4, 5);
		/*
		 * sdfsfs dfsfdsfsd
		 * 
		 */
		short length = 7;

		drawSquare(length);
	}

	/**
	 * @param height
	 * @param width
	 */
	public static void drawFullShape(int height, int width) {
		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void drawShapeOutline(int height, int width) {
		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				if (i == 1 || i == height || j == 1 || j == width) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	public static void drawShapeCorners(int height, int width) {
		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				if ((i == 1 || i == height) && (j == 1 || j == width)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	public static void drawSquare(short length) {
		for (int i = 1; i <= length; i++) {

			for (int j = 1; j <= length; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
