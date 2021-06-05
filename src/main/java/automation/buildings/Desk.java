package automation.buildings;

public class Desk {
	private String name;
	private int deskNumber;

	public Desk(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
