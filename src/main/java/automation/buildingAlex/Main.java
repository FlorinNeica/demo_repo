package automation.buildingAlex;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException {
		Building building = new Building();
		building.setBuildingName("My awesome Java building");

		// region Floor 1
		/* === Floor 1 === */
		Floor floor = new Floor("1st Floor");
		building.addFloor(floor);

		/* Office space 1, from Floor 1 */
		Room room = new OfficeSpace();
		room.setRoomName("Office space 1.1");
		room.addFurniture(FurnitureType.DESK, 20);
		floor.addRoom(room);

		/* Toilet on Floor 1 */
		room = new Toilet();
		floor.addRoom(room);

		/* Toilet on Floor 1 */
		room = new Toilet();
		floor.addRoom(room);

		/* Kitchen on Floor 1 */
		room = new Kitchen();
		room.setRoomName("Floor 1 Kitchen");
		room.addAppliance(ApplianceType.COFFEE_MACHINE, 1);
		room.addAppliance(ApplianceType.WATER_DISPENSER, 1);
		room.addAppliance(ApplianceType.FRIDGE, 1);
		floor.addRoom(room);

		/* Conference room 1.1 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 1.1");
		room.addFurniture(FurnitureType.SEAT, 10);
		room.addAppliance(ApplianceType.TV, 1);
		floor.addRoom(room);

		/* Conference room 1.2 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 1.2");
		room.addFurniture(FurnitureType.SEAT, 10);
		room.addAppliance(ApplianceType.TV, 1);
		floor.addRoom(room);

		/* Conference room 1.3 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 1.3");
		room.addFurniture(FurnitureType.SEAT, 10);
		room.addAppliance(ApplianceType.TV, 1);
		floor.addRoom(room);
		// endregion

		// region Floor 2
		/* === Floor 2 === */
		floor = new Floor("2nd floor");
		building.addFloor(floor);

		/* Office space 1, from Floor 2 */
		room = new OfficeSpace();
		room.setRoomName("Office space 2.1");
		room.addFurniture(FurnitureType.DESK, 10);
		floor.addRoom(room);

		/* Office space 2, from Floor 2 */
		room = new OfficeSpace();
		room.setRoomName("Office space 2.2");
		room.addFurniture(FurnitureType.DESK, 10);
		floor.addRoom(room);

		/* Toilet on Floor 2 */
		room = new Toilet();
		floor.addRoom(room);

		/* Toilet on Floor 2 */
		room = new Toilet();
		floor.addRoom(room);

		/* Kitchen on Floor 2 */
		room = new Kitchen();
		room.setRoomName("Floor 1 Kitchen");
		room.addAppliance(ApplianceType.COFFEE_MACHINE, 1);
		room.addAppliance(ApplianceType.WATER_DISPENSER, 1);
		room.addAppliance(ApplianceType.FRIDGE, 1);
		floor.addRoom(room);

		/* Conference room 2.1 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 2.1");
		room.addFurniture(FurnitureType.SEAT, 8);
		room.addAppliance(ApplianceType.TV, 1);
		floor.addRoom(room);

		/* Conference room 2.2 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 2.2");
		room.addFurniture(FurnitureType.SEAT, 8);
		room.addAppliance(ApplianceType.TV, 1);
		floor.addRoom(room);

		/* Conference room 2.3 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 2.3");
		room.addFurniture(FurnitureType.SEAT, 8);
		room.addAppliance(ApplianceType.TV, 1);
		floor.addRoom(room);

		/* Conference room 2.4 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 2.4");
		room.addFurniture(FurnitureType.SEAT, 8);
		room.addAppliance(ApplianceType.TV, 1);
		floor.addRoom(room);
		// endregion

		// region Floor 3
		/* === Floor 3 === */
		floor = new Floor("3rd floor");
		building.addFloor(floor);

		/* Toilet on Floor 3 */
		room = new Toilet();
		floor.addRoom(room);

		/* Toilet on Floor 3 */
		room = new Toilet();
		floor.addRoom(room);

		/* Conference room 3.1 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 3.1");
		room.addFurniture(FurnitureType.SEAT, 30);
		room.addAppliance(ApplianceType.VIDEO_PROJECTOR, 1);
		room.addAppliance(ApplianceType.TELEPRESENCE, 1);
		floor.addRoom(room);

		/* Conference room 3.2 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 3.2");
		room.addFurniture(FurnitureType.SEAT, 20);
		room.addAppliance(ApplianceType.TV, 1);
		room.addAppliance(ApplianceType.TELEPRESENCE, 1);
		floor.addRoom(room);

		/* Conference room 3.3 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 3.3");
		room.addFurniture(FurnitureType.SEAT, 10);
		room.addAppliance(ApplianceType.TV, 1);
		room.addAppliance(ApplianceType.TELEPRESENCE, 1);
		floor.addRoom(room);

		/* Conference room 3.4 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 3.4");
		room.addFurniture(FurnitureType.SEAT, 10);
		room.addAppliance(ApplianceType.TV, 1);
		room.addAppliance(ApplianceType.TELEPRESENCE, 1);
		floor.addRoom(room);

		/* Conference room 3.5 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 3.5");
		room.addFurniture(FurnitureType.SEAT, 10);
		room.addAppliance(ApplianceType.TV, 1);
		room.addAppliance(ApplianceType.TELEPRESENCE, 1);
		floor.addRoom(room);

		/* Conference room 3.6 */
		room = new ConferenceRoom();
		room.setRoomName("Conference Room 3.6");
		room.addFurniture(FurnitureType.SEAT, 10);
		room.addAppliance(ApplianceType.TV, 1);
		room.addAppliance(ApplianceType.TELEPRESENCE, 1);
		floor.addRoom(room);
		// endregion

		System.out.println(building);
	}
}
