package automation.buildings;

import java.util.List;

/**
 * The OfficeSpace class
 * 
 * @author ionel
 *
 */

public class OfficeSpace {
	/**
	 * @param name
	 *        - The name of the office spaces
	 * @list Desk- The list of desks
	 */
	private String name;
	private List<Desk> desks;

	//Office Space instance
	public OfficeSpace(String name, List<Desk> desks) {
		this.name = name;
		this.desks = desks;
	}

	/**
	 * This method returns the name of the office space and the number of desks
	 */
	@Override
	public String toString() {
		return name + ": " + desks.size() + " desks";
	}
}