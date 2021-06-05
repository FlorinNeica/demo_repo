package automation.buildings;

import java.util.List;

/**
 * The Floor class
 * 
 * @author ionel
 *
 */
public class Floor extends Building {
	private String name;
	private int floorNumber;
	private List<OfficeSpace> officeSpaces;
	private List<Toilet> toilets;
	private List<Kitchen> kitchens;
	private List<ConferenceRoom> conferenceRooms;

	
	public Floor(String name, List<OfficeSpace> officeSpaces, List<Toilet> toilets, List<Kitchen> kitchens,
			List<ConferenceRoom> conferenceRooms) {
		this.name = name;
		this.officeSpaces = officeSpaces;
		this.toilets = toilets;
		this.kitchens = kitchens;
		this.conferenceRooms = conferenceRooms;
	}

	@Override
	public String getName() {
		return name;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public List<OfficeSpace> getOfficeSpaces() {
		return officeSpaces;
	}

	public List<Toilet> getToilets() {
		return toilets;
	}

	public List<Kitchen> getKitchens() {
		return kitchens;
	}

	public List<ConferenceRoom> getConferenceRooms() {
		return conferenceRooms;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n" + name + ":" 
				+ "\n\t" + officeSpaces.size() + " OfficeSpaces" 
				+ "\n\t\t" + officeSpaces 
				+ "\n\t"+toilets.size()+ " Toilets"
				+ "\n\t\t" + toilets
				+ "\n\t"+kitchens.size()+" Kitchens"
				+ "\n\t\t" + kitchens 
				+ "\n\t"+ conferenceRooms.size()+" ConferenceRooms"
				+ "\n\t\t" + conferenceRooms;
	}
}