package automation.oop;

public class Array {

	public static void main(String[] args) {

		Light[] lights = { new Light(), new Light(), new Light() };

		System.out.println(lights.length);

		Light light = lights[1];
		light.brigthen();

		System.out.println(light.getIntensity());

		Light[] lights2 = new Light[3];

		lights2[1] = new Light();

		System.out.println(lights2.length);

		System.out.println(lights2[1].getIntensity());

		for (int i = 0; i < lights.length; i++) {
			System.out.println(lights[i].isOn());

		}

		// verific daca 2 obiecte in java sunt egale
		Light l1 = new Light();
		Light l2 = new Light();
		l1.equals(l2);

	}

}
