package automation.buildings;

/**
 * The Test class where I solved the homework's requirements
 * 
 * @author ionel
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		/**
		 * The composition for Floor 1 with: 1 office space and 20 desks, 2 toilets, 1 kitchen, 3 conference rooms
		 */
		// Desks composition on Floor 1
		List<Desk> desksOfficeSpace1 = new ArrayList<>();
		Desk desk1 = new Desk("Desk1");
		Desk desk2 = new Desk("Desk2");
		Desk desk3 = new Desk("Desk3");
		Desk desk4 = new Desk("Desk4");
		Desk desk5 = new Desk("Desk5");
		Desk desk6 = new Desk("Desk6");
		Desk desk7 = new Desk("Desk7");
		Desk desk8 = new Desk("Desk8");
		Desk desk9 = new Desk("Desk9");
		Desk desk10 = new Desk("Desk10");
		Desk desk11 = new Desk("Desk11");
		Desk desk12 = new Desk("Desk12");
		Desk desk13 = new Desk("Desk13");
		Desk desk14 = new Desk("Desk14");
		Desk desk15 = new Desk("Desk15");
		Desk desk16 = new Desk("Desk16");
		Desk desk17 = new Desk("Desk17");
		Desk desk18 = new Desk("Desk18");
		Desk desk19 = new Desk("Desk19");
		Desk desk20 = new Desk("Desk20");
		desksOfficeSpace1.add(desk1);
		desksOfficeSpace1.add(desk2);
		desksOfficeSpace1.add(desk3);
		desksOfficeSpace1.add(desk4);
		desksOfficeSpace1.add(desk5);
		desksOfficeSpace1.add(desk6);
		desksOfficeSpace1.add(desk7);
		desksOfficeSpace1.add(desk8);
		desksOfficeSpace1.add(desk9);
		desksOfficeSpace1.add(desk10);
		desksOfficeSpace1.add(desk11);
		desksOfficeSpace1.add(desk12);
		desksOfficeSpace1.add(desk13);
		desksOfficeSpace1.add(desk14);
		desksOfficeSpace1.add(desk15);
		desksOfficeSpace1.add(desk16);
		desksOfficeSpace1.add(desk17);
		desksOfficeSpace1.add(desk18);
		desksOfficeSpace1.add(desk19);
		desksOfficeSpace1.add(desk20);

		// Office Space 1 composition on Floor 1
		List<OfficeSpace> officeSpacesFloor1 = new ArrayList<>();
		OfficeSpace officeSpace1 = new OfficeSpace("Office space 1", desksOfficeSpace1);
		officeSpacesFloor1.add(officeSpace1);

		// Toilet 1 and 2 composition on Floor 1
		List<Toilet> toiletsFloor1 = new ArrayList<>();
		Toilet toilet1 = new Toilet("Toilet 1");
		Toilet toilet2 = new Toilet("Toilet 2");
		toiletsFloor1.add(toilet1);
		toiletsFloor1.add(toilet2);

		// Kitchen 1 composition on Floor 1
		List<Kitchen> kitchensFloor1 = new ArrayList<>();
		Kitchen kitchen1 = new Kitchen("Kitchen 1", 1, 1, 1);
		kitchensFloor1.add(kitchen1);

		// Conference Rooms 1, 2, 3 composition on Floor 1
		List<ConferenceRoom> conferenceRoomsFloor1 = new ArrayList<>();
		ConferenceRoom conferenceRoom1 = new ConferenceRoom("Conference room 1", 10, 1, 0, 0);
		ConferenceRoom conferenceRoom2 = new ConferenceRoom("Conference room 2", 10, 1, 0, 0);
		ConferenceRoom conferenceRoom3 = new ConferenceRoom("Conference room 3", 10, 1, 0, 0);
		conferenceRoomsFloor1.add(conferenceRoom1);
		conferenceRoomsFloor1.add(conferenceRoom2);
		conferenceRoomsFloor1.add(conferenceRoom3);

		/**
		 * The composition for Floor 2 with: 2 office spaces with 10 desks each , 2 toilets, 1 kitchen, 4 conference rooms
		 */

		// Desks composition on Floor 2
		List<Desk> desksOfficeSpace2 = new ArrayList<>();
		Desk desk21 = new Desk("Desk21");
		Desk desk22 = new Desk("Desk22");
		Desk desk23 = new Desk("Desk23");
		Desk desk24 = new Desk("Desk24");
		Desk desk25 = new Desk("Desk25");
		Desk desk26 = new Desk("Desk26");
		Desk desk27 = new Desk("Desk27");
		Desk desk28 = new Desk("Desk28");
		Desk desk29 = new Desk("Desk29");
		Desk desk30 = new Desk("Desk30");
		desksOfficeSpace2.add(desk21);
		desksOfficeSpace2.add(desk22);
		desksOfficeSpace2.add(desk23);
		desksOfficeSpace2.add(desk24);
		desksOfficeSpace2.add(desk25);
		desksOfficeSpace2.add(desk26);
		desksOfficeSpace2.add(desk27);
		desksOfficeSpace2.add(desk28);
		desksOfficeSpace2.add(desk29);
		desksOfficeSpace2.add(desk30);

		List<Desk> desksOfficeSpace3 = new ArrayList<>();
		Desk desk31 = new Desk("Desk31");
		Desk desk32 = new Desk("Desk32");
		Desk desk33 = new Desk("Desk33");
		Desk desk34 = new Desk("Desk34");
		Desk desk35 = new Desk("Desk35");
		Desk desk36 = new Desk("Desk36");
		Desk desk37 = new Desk("Desk37");
		Desk desk38 = new Desk("Desk38");
		Desk desk39 = new Desk("Desk39");
		Desk desk40 = new Desk("Desk40");

		desksOfficeSpace3.add(desk31);
		desksOfficeSpace3.add(desk32);
		desksOfficeSpace3.add(desk33);
		desksOfficeSpace3.add(desk34);
		desksOfficeSpace3.add(desk35);
		desksOfficeSpace3.add(desk36);
		desksOfficeSpace3.add(desk37);
		desksOfficeSpace3.add(desk38);
		desksOfficeSpace3.add(desk39);
		desksOfficeSpace3.add(desk40);

		// Office space 2, 3 composition on Floor 2
		List<OfficeSpace> officeSpacesFloor2 = new ArrayList<>();
		OfficeSpace officeSpace2 = new OfficeSpace("Office space 2", desksOfficeSpace2);
		OfficeSpace officeSpace3 = new OfficeSpace("Office space 3", desksOfficeSpace3);
		officeSpacesFloor2.add(officeSpace2);
		officeSpacesFloor2.add(officeSpace3);

		// Toilet 3, 4 composition on Floor 2
		List<Toilet> toiletsFloor2 = new ArrayList<>();
		Toilet toilet3 = new Toilet("Toilet 3");
		Toilet toilet4 = new Toilet("Toilet 4");
		toiletsFloor2.add(toilet3);
		toiletsFloor2.add(toilet4);

		// Kitchen 2 composition on Floor 2
		List<Kitchen> kitchensFloor2 = new ArrayList<>();
		Kitchen kitchen2 = new Kitchen("Kitchen 2", 1, 1, 1);
		kitchensFloor2.add(kitchen2);

		// Conference Room 4, 5, 6, 7 composition on Floor 2
		List<ConferenceRoom> conferenceRoomsFloor2 = new ArrayList<>();
		ConferenceRoom conferenceRoom4 = new ConferenceRoom("Conference room 4", 8, 1, 0, 0);
		ConferenceRoom conferenceRoom5 = new ConferenceRoom("Conference room 5", 8, 1, 0, 0);
		ConferenceRoom conferenceRoom6 = new ConferenceRoom("Conference room 6", 8, 1, 0, 0);
		ConferenceRoom conferenceRoom7 = new ConferenceRoom("Conference room 7", 8, 1, 0, 0);
		conferenceRoomsFloor2.add(conferenceRoom4);
		conferenceRoomsFloor2.add(conferenceRoom5);
		conferenceRoomsFloor2.add(conferenceRoom6);
		conferenceRoomsFloor2.add(conferenceRoom7);

		/**
		 * The composition for Floor 3 with: 2 toilets and 6 conference rooms
		 */

		List<OfficeSpace> officeSpacesFloor3 = new ArrayList<>();
		List<Kitchen> kitchensFloor3 = new ArrayList<>();

		//Toilet 5, 6 composition on Floor 3
		List<Toilet> toiletsFloor3 = new ArrayList<>();
		Toilet toilet5 = new Toilet("Toilet 5");
		Toilet toilet6 = new Toilet("Toilet 6");
		toiletsFloor3.add(toilet5);
		toiletsFloor3.add(toilet6);

		//Conference Rooms 8, 9, 10 , 11, 12, 13 composition on Floor 3
		List<ConferenceRoom> conferenceRoomsFloor3 = new ArrayList<>();
		ConferenceRoom conferenceRoom8 = new ConferenceRoom("Conference room 8", 30, 0, 1, 1);
		ConferenceRoom conferenceRoom9 = new ConferenceRoom("Conference room 9", 20, 1, 0, 1);
		ConferenceRoom conferenceRoom10 = new ConferenceRoom("Conference room 10", 10, 1, 0, 1);
		ConferenceRoom conferenceRoom11 = new ConferenceRoom("Conference room 11", 10, 1, 0, 1);
		ConferenceRoom conferenceRoom12 = new ConferenceRoom("Conference room 12", 10, 1, 0, 1);
		ConferenceRoom conferenceRoom13 = new ConferenceRoom("Conference room 13", 10, 1, 0, 1);

		conferenceRoomsFloor3.add(conferenceRoom8);
		conferenceRoomsFloor3.add(conferenceRoom9);
		conferenceRoomsFloor3.add(conferenceRoom10);
		conferenceRoomsFloor3.add(conferenceRoom11);
		conferenceRoomsFloor3.add(conferenceRoom12);
		conferenceRoomsFloor3.add(conferenceRoom13);

		
		//Floors composition 
		List<Floor> floors = new ArrayList<>();
		Floor floor1 = new Floor("Floor1", officeSpacesFloor1, toiletsFloor1, kitchensFloor1, conferenceRoomsFloor1);
		Floor floor2 = new Floor("Floor2", officeSpacesFloor2, toiletsFloor2, kitchensFloor2, conferenceRoomsFloor2);
		Floor floor3 = new Floor("Floor3", officeSpacesFloor3, toiletsFloor3, kitchensFloor3, conferenceRoomsFloor3);

		floors.add(floor1);
		floors.add(floor2);
		floors.add(floor3);

		Building building = new Building("Office Florin", floors);

		//Prints the structure of the building
		System.out.println(building.toString().replace("[", " ").replace("]", "").replace(",", " \n\t\t"));
	}
}