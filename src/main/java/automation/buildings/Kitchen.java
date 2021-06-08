package automation.buildings;

/**
 * The Kitchen class
 * 
 * @author ionel
 *
 */
public class Kitchen {
	/**
	 * @param name
	 *        - The name of the kitchen
	 * @param coffeeMachine
	 *        - The number of coffee machines
	 * @param waterDispenser
	 *        - The number of water dispensers
	 * @param fridge- The number of fridges
	 */
	private String name;
	private int coffeeMachine;
	private int waterDispenser;
	private int fridge;

	//Kitchen instance
	public Kitchen(String name, int coffeeMachine, int waterDispenser, int fridge) {
		this.name = name;
		this.coffeeMachine = coffeeMachine;
		this.waterDispenser = waterDispenser;
		this.fridge = fridge;
	}

	//Returns the number of coffee machines
	public int getCoffeeMachine() {
		return coffeeMachine;
	}

	//Returns the number of water dispensers
	public int getWaterDispenser() {
		return waterDispenser;
	}

	//Returns the number of fridges
	public int getFridge() {
		return fridge;
	}
	
	/**
	 * This method returns and indents:
	 * the name and number of coffee machines, water dispensers, fridges
	 */
	@Override
	public String toString() {
		return name 
				+"\n\t\t\t"+ coffeeMachine+" "+ Enum.COFFEE_MACHINE
		        +"\n\t\t\t"+ waterDispenser+ " "+ Enum.WATER_DISPENSER
		        +"\n\t\t\t"+ fridge +" "+ Enum.FRIDGE;
	}
}