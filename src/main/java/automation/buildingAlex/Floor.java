package automation.buildingAlex;

import java.util.ArrayList;
import java.util.List;

public class Floor {
	private List<Room> roomList;
	private String floorName;

	Floor(String floorName) {
		this.floorName = floorName;
		this.roomList = new ArrayList<Room>();
	}

	void addRoom(Room room) {
		this.roomList.add(room);
	}

	String getFloorName() {
		return floorName;
	}

	void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	// Not the best implementation, the Map one (see Room class) is better. This is done for the sake of example
	@Override
	public String toString() {
		String s = this.floorName;

		List<Room> conferenceRoomList = new ArrayList<Room>();
		List<Room> officeSpaceList = new ArrayList<Room>();
		List<Room> toiletList = new ArrayList<Room>();
		List<Room> kitchenList = new ArrayList<Room>();

		for (Room r : this.roomList) {
			if (r.getRoomType()
					.equals(RoomType.CONFERENCE_ROOM)) {
				conferenceRoomList.add(r);
			} else if (r.getRoomType()
					.equals(RoomType.TOILET)) {
				toiletList.add(r);
			} else if (r.getRoomType()
					.equals(RoomType.OFFICE_SPACE)) {
				officeSpaceList.add(r);
			} else if (r.getRoomType()
					.equals(RoomType.KITCHEN)) {
				kitchenList.add(r);
			}
		}

		if (officeSpaceList.size() > 0) {
			s = s + "\n\t\t" + officeSpaceList.size() + " Office space(s)";
			for (Room r : officeSpaceList) {
				s = s + "\n\t\t\t" + r.toString();
			}
		}

		if (conferenceRoomList.size() > 0) {
			s = s + "\n\t\t" + conferenceRoomList.size() + " Conference room(s)";
			for (Room r : conferenceRoomList) {
				s = s + "\n\t\t\t" + r.toString();
			}
		}

		if (kitchenList.size() > 0) {
			s = s + "\n\t\t" + kitchenList.size() + " Kitchen(s)";
			for (Room r : kitchenList) {
				s = s + "\n\t\t\t" + r.toString();
			}
		}

		if (toiletList.size() > 0) {
			s = s + "\n\t\t" + toiletList.size() + " Toilet(s)";
		}

		return s;
	}
}
