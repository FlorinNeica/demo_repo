package automation.oop2;

public class Rectangle extends Shape {

	private int largeSide;
	private int smallSide;

	public int getLargeSide() {
		return largeSide;
	}

	public void setLargeSide(int largeSide) {

		if (largeSide > 0) {
			this.largeSide = largeSide;
		}

	}

	public int getSmallSIde() {
		return smallSide;
	}

	public void setLargeSige(int smallSide) {

		if (smallSide > 0) {
			this.smallSide = smallSide;
		}
	}

	public double getArea() {
		return smallSide * largeSide;
	}

	@Override
	public String draw() {
		return "Drawing a rectangle!";
	}
}
