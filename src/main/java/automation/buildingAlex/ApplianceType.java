package automation.buildingAlex;

public enum ApplianceType {
	WATER_DISPENSER("Water dispenser(s)"), FRIDGE("Fridge(s)"), COFFEE_MACHINE("Coffee machine(s)"), TV("TV(s)"), VIDEO_PROJECTOR(
			"Video projector(s)"), TELEPRESENCE("Telepresence device(s)");

	private String value;

	ApplianceType(String val) {
		this.value = val;
	}

	public String getValue() {
		return value;
	}
}