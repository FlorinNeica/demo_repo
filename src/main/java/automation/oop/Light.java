package automation.oop;

public class Light {

	private boolean isOn;
	private byte intensity = 10;

	public void turnOn() {
		this.isOn = true;
	}

	public void turnOff() {
		this.isOn = false;
	}

	public boolean isOn() {
		return isOn;
	}

	public void dim() {
		if (intensity > 0) {
			intensity--;

			if (intensity == 0) {
				turnOff();
			}
		}

	}

	public void brigthen() {
		if (intensity < 10) {
			intensity++;

			if (intensity == 1) {
				turnOn();
			}
		}
	}

	public byte getIntensity() {
		return intensity;
	}

}
