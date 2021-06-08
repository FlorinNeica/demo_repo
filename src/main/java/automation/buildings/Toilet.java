package automation.buildings;

/**
 * The Toilet class with name
 * 
 * @author ionel
 *
 */
public class Toilet {
	private String name;

	// Toilet instance
	public Toilet(String name) {
		this.name = name;
	}

	/**
	 * This method returns the name of the Toilet
	 */
	@Override
	public String toString() {
		return name;
	}
}