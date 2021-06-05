package automation.buildings;

/**
 * The Toilet class
 * 
 * @author ionel
 *
 */

public class Toilet {
	private String name;

	public Toilet(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}