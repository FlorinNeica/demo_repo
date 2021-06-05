package automation.oop2;

public class Square extends Rectangle {

	private int side;

	/*
	 * public int getSide() { return side; }
	 * 
	 * public void setSide(int side) {
	 * 
	 * if (side > 0) { this.side = side; }
	 * 
	 * }
	 */
	// daca am facut @Override la methodele din rectangle pot sterge getterul si setterul de sus!!!!!!

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public int getLargeSide() {
		return side;
	}

	@Override
	public void setLargeSide(int largeSide) {

		if (largeSide > 0) {
			this.side = largeSide;
		}

	}

	@Override
	public int getSmallSIde() {
		return side;
	}

	@Override
	public void setLargeSige(int smallSide) {

		if (smallSide > 0) {
			this.side = smallSide;
		}
	}

	@Override
	public String draw() {
		return "Drawing a square!";
	}

	@Override
	public String toString() {
		return "The side length is: " + side;

	}
}
