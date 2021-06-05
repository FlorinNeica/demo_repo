package automation.buildings;

/**
 * The Kitchen class
 * 
 * @author ionel
 *
 */

public class Kitchen {

	private String name;
	private int coffeeMachine;
	private int waterDispenser;
	private int fridge;

	public Kitchen(String name, int coffeeMachine, int waterDispenser, int fridge) {
		this.name = name;
		this.coffeeMachine = coffeeMachine;
		this.waterDispenser = waterDispenser;
		this.fridge = fridge;
	}

	public int getCoffeeMachine() {
		return coffeeMachine;
	}

	public int getWaterDispenser() {
		return waterDispenser;
	}

	public int getFridge() {
		return fridge;
	}

	@Override
	public String toString() {
		return name + "\n\t\t\t Coffee Machine=" + coffeeMachine + "\n\t\t\t Water Dispenser=" + waterDispenser + "\n\t\t\t Fridge="
				+ fridge;
	}

}