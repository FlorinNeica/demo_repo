package automation.buildingAlex;

import java.util.ArrayList;
import java.util.List;

public class Building {
	Building() {
		this.floorList = new ArrayList<Floor>();
	}

	private List<Floor> floorList;
	private String buildingName;

	void addFloor(Floor floor) {
		this.floorList.add(floor);
	}

	String getBuildingName() {
		return buildingName;
	}

	void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	List<Floor> getFloorList() {
		return floorList;
	}

	void setFloorList(List<Floor> floorList) {
		this.floorList = floorList;
	}

	public String toString() {
		String s = "Building \"" + buildingName + "\" has " + floorList.size() + " floors";
		for (Floor f : floorList) {
			s = s + "\n\t" + f.toString();
		}

		return s;
	}
}

