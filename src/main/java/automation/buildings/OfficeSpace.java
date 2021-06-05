package automation.buildings;

import java.util.List;

/**
 * The OfficeSpace class
 * 
 * @author ionel
 *
 */

public class OfficeSpace {

	private String name;
	private List<Desk> desks;

	public OfficeSpace(String name, List<Desk> desks) {
		this.name = name;
		this.desks = desks;

	}

	@Override
	public String toString() {

		return name + ": " + desks.size() + " desks";

	}

	// @Override
	// public String toString() {
	// return name;
	// }
}