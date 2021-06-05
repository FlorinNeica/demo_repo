package automation.oop2;

public class Circle extends Shape {
	private String color = "red";

	@Override
	public String draw() {
		return "Drawing a circle!";
	}

	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle of color:" + this.getColor();
	}
}
