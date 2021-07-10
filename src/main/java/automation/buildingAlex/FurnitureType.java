package automation.buildingAlex;

public enum FurnitureType {
	DESK("Desk(s)"), SEAT("Seat(s)");

	private String value;

	FurnitureType(String val) {
		this.value = val;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
