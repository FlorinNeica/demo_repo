package automation.oop;

import java.util.Objects;

public class Light {

	private boolean isOn;
	private byte intensity = 10;
	private boolean state;

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

	//suprascriere equals si hashcode daca vreau sa compar 2 obiecte in java
	@Override
	public boolean equals(Object o) {

		if (o == null)
			return false;

		if (o == this)
			return true;

		if (!(o instanceof Light))
			return false;

		Light light = (Light) o;

		boolean isEqual = this.state == light.state && this.intensity == light.intensity;

		return isEqual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(state, intensity);
	}

}
