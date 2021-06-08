package automation.buildings;

/**
 * The ConferenceRoom class
 * 
 * @author ionel
 *
 */
public class ConferenceRoom {
	/**
	 * @param name
	 *        - The name of the conference room
	 * @param tv
	 *        - The number of tv's
	 * @param videoProjector
	 *        - The number of video projector's
	 * @param telepresence- the number of telepresence's       
	 */
	private String name;
	private int seat;
	private int tv;
	private int videoProjector;
	private int telepresence;

	// Toilet instance
	public ConferenceRoom(String name, int seat, int tv, int videoProjector, int telepresence) {
		this.name = name;
		this.seat = seat;
		this.tv = tv;
		this.videoProjector = videoProjector;
		this.telepresence = telepresence;
	}

	//Returns the number of seats
	public int getSeats() {
		return seat;
	}

	//Returns the number of TVs
	public int getTv() {
		return tv;
	}

	//Returns the number of Video Projectors
	public int getVideoProjector() {
		return videoProjector;
	}

	//Returns the number of Telepresences
	public int getTelepresence() {
		return telepresence;
	}

	/**
	 * This method returns and indents:
	 * the name of the conference rooms
	 * the number of seats, tvs, videoprojectors, telepresences
	 */
	@Override
	public String toString() {
		return name
				+"\n\t\t\t"+ seat + " "+ Enum.SEATS
				+"\n\t\t\t"+ tv + " "+ Enum.TV
				+"\n\t\t\t"+ videoProjector + " "+ Enum.VIDEOPROJECTOR
				+"\n\t\t\t"+ telepresence + " "+ Enum.TELEPRESENCE;
	}
}