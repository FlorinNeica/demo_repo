package automation.buildings;

/**
 * The Desk class with name
 * 
 * @author ionel
 *
 */
public class Desk {

	private String name;

	// Desk instance
	public Desk(String name) {
		this.name = name;
	}

	// Returns the name of the desk
	public String getName() {
		return name;
	}

	// This method return the name of the Desk
	@Override
	public String toString() {
		return name;
	}
}
