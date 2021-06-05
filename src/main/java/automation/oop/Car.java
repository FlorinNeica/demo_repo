package automation.oop;

public class Car {

	private boolean state;
	private int velocity;
	private String direction;

	public void start() {
		this.state = true;
	}

	public void stop() {
		this.state = false;
	}

	public void accelerate() {
		this.velocity++;
	}

	public void turnLeft() {
		this.direction = "Turn left";

	}

	public void turnRight() {
		this.direction = "Turn right";

	}
}
