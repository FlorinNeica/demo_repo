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
	 */
	private String name;
	private int lenght;
	private int width;
	private int height;

	private List<Floor> floors;

	// Building instance

	public Building() {

	}

	public Building(String name, List<Floor> floors) {
		this.name = name;
		this.floors = floors;

	}

	public String getName() {
		return name;
	}

	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	//
	// @Override
	// public String toString() {
	// return "Building " + name + floors;
	// }

	@Override
	public String toString() {
		// return "Building " + name + " has: " + floors.size() + " Floors";
		return "Building " + name + " has: " + floors.size() + " Floors" + floors;
	}

}