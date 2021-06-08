package automation.buildings;

import java.util.List;

/**
 * The Floor class
 * 
 * @author ionel
 *
 */
public class Floor extends Building {
	/**
	 * @param name
	 *        - The name of the floor
	 * @list OfficeSpaces - the list with office spaces
	 * @list Toilet - the list with toilets
	 * @list Kitchen - the list with kitchens
	 * @list ConferenceRoom - the list with conference rooms
	 */
	private String name;
	private List<OfficeSpace> officeSpaces;
	private List<Toilet> toilets;
	private List<Kitchen> kitchens;
	private List<ConferenceRoom> conferenceRooms;

	// floor instance
	public Floor(String name, List<OfficeSpace> officeSpaces, List<Toilet> toilets, List<Kitchen> kitchens,
			List<ConferenceRoom> conferenceRooms) {
		this.name = name;
		this.officeSpaces = officeSpaces;
		this.toilets = toilets;
		this.kitchens = kitchens;
		this.conferenceRooms = conferenceRooms;
	}

	/**
	 * This method returns and indents: the name of the floors the number and the name of the office spaces on every floor the number and the name of the toilets on every floor the number and the name of the kitchens on every
	 * floor the number and the name of the conference rooms on every floor
	 */
	@Override
	public String toString() {
		return "\n" + name + ":" 
				+ "\n\t" + officeSpaces.size() + " Office Spaces"
				+ "\n\t\t" + officeSpaces 
				+ "\n\t" + toilets.size()+ " Toilets" 
				+ "\n\t\t" + toilets 
				+ "\n\t" + kitchens.size() + " Kitchens" 
				+ "\n\t\t" + kitchens 
				+ "\n\t"+ conferenceRooms.size() + " Conference Rooms" 
				+ "\n\t\t" + conferenceRooms;
	}
}