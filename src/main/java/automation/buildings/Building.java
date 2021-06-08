package automation.buildings;

import java.util.List;

/**
 * The Building class
 * 
 * @author ionel
 *
 */
public class Building {
	/**
	 * @param name
	 *        - The name of the builing
	 * @param height
	 *        - The height of the building in m
	 * @param width
	 *        - The width of the building in m
	 * @list Floor- The list of Floors
	 */
	private String name;
	private int lenght;
	private int width;
	private int height;

	private List<Floor> floors;

	// Building instances

	public Building() {
	}

	public Building(String name, List<Floor> floors) {
		this.name = name;
		this.floors = floors;
	}

	// Returns the name of the building
	public String getName() {
		return name;
	}

	// Returns the length of the building
	public int getLenght() {
		return lenght;
	}

	// Returns the width of the building
	public int getWidth() {
		return width;
	}

	// Returns the heigth of the building
	public int getHeight() {
		return height;
	}

	/**
	 * This method returns: the name of the building the number of floors the content of every floor
	 */
	@Override
	public String toString() {
		return name + " has " + floors.size() + " floors" + floors;
	}
}