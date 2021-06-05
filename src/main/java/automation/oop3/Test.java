package automation.oop3;

public class Test {

	public static void main(String[] args) {

		Walker walker = new Walker();
		System.out.println("Walker");

		walker.walk();
		walker.breath();
		System.out.println();

		Talker talker = new Talker();
		System.out.println("Talker");

		talker.talk();
		talker.breath();
		System.out.println();

		Swimmer swimmer = new Swimmer();
		System.out.println("Swimmer");
		swimmer.swimm();
		swimmer.breath();
		swimmer.talk();
		swimmer.walk();
	}

}
