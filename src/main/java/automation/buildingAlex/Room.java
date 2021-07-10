package automation.buildingAlex;

import java.util.HashMap;

public class Room {
	Room() {
		this.roomName = "UNKNOWN_ROOM_NAME";
		for (ApplianceType a : ApplianceType.values()) {
			appliances.put(a, 0);
		}

		for (FurnitureType f : FurnitureType.values()) {
			furniture.put(f, 0);
		}
	}

	private RoomType roomType;
	private String roomName;
	private HashMap<ApplianceType, Integer> appliances = new HashMap<ApplianceType, Integer>();
	private HashMap<FurnitureType, Integer> furniture = new HashMap<FurnitureType, Integer>();

	void addAppliance(ApplianceType type, int howMany) {
		int existingApplianceNo = appliances.get(type);
		existingApplianceNo = existingApplianceNo + howMany;
		appliances.put(type, existingApplianceNo);
	}

	void addFurniture(FurnitureType type, int howMany) {
		int existingFurnitureNo = furniture.get(type);
		existingFurnitureNo = existingFurnitureNo + howMany;
		furniture.put(type, existingFurnitureNo);
	}

	String getRoomName() {
		return roomName;
	}

	void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	RoomType getRoomType() {
		return roomType;
	}

	void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		String s = this.roomName;

		for (FurnitureType furnitureType : furniture.keySet()) {
			int existingFurnitureNo = furniture.get(furnitureType);
			if (existingFurnitureNo > 0) {
				s = s + "\n\t\t\t\t" + existingFurnitureNo + " " + furnitureType;
			}
		}

		for (ApplianceType applianceType : appliances.keySet()) {
			int existingAppliancesNo = appliances.get(applianceType);
			if (existingAppliancesNo > 0) {
				s = s + "\n\t\t\t\t" + existingAppliancesNo + " " + applianceType.getValue();
			}
		}

		return s;
	}
}
