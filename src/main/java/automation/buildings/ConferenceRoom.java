package automation.buildings;

/**
 * The ConferenceRoom class
 * 
 * @author ionel
 *
 */
public class ConferenceRoom extends Floor {

	private String name;
	private int seat;
	private int equipment;
	private int telepresence;

	public ConferenceRoom(String name, int seat, int equipment) {
		this.name = name;
		this.seat = seat;
		this.equipment = equipment;
	}

	public ConferenceRoom(String name, int seat, int equipment, int telepresence) {
		this.name = name;
		this.seat = seat;
		this.equipment = equipment;
		this.telepresence = telepresence;
	}

	public int getSeats() {
		return seat;
	}

	public int getEquipment() {
		return equipment;
	}

	public int getTelepresence() {
		return telepresence;
	}

	@Override
	public String toString() {
		return name + "\n\t\t\t" + seat + " Seats";
	}

}