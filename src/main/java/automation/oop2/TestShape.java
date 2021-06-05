package automation.oop2;

public class TestShape {

	public static void main(String[] args) {

		Shape shape = new Shape();
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();

		Shape t1 = new Triangle();

		doSomething(t1);
		doSomething(triangle);

		System.out.println(rectangle.draw());

		System.out.println(rectangle.toString());

	}

	public static void doSomething(Shape s) {
		s.draw();
	}
}
