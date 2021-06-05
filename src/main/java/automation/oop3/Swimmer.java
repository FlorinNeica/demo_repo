package automation.oop3;

public class Swimmer extends Person {

	private Talker talker = new Talker();
	private Walker walker = new Walker();

	public void swimm() {

		System.out.println("I can swimm");
	}

	public void talk() {
		talker.talk();

	}

	public void walk() {
		walker.walk();
	}
}
