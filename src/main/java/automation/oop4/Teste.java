package automation.oop4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import automation.enums.Browser;
import automation.oop2.Circle;

public class Teste {

	public static void main(String[] array) {

		Browser b = Browser.FIREFOX;// de la declararea enums

		int browserStr = b.ordinal();

		Browser browser = Browser.valueOf("FIREFOX");

		Browser[] browserArray = Browser.values();

		System.out.println(b.getVersion());

		// testMap();
	}

	public static void testMap() {

		Circle circle = new Circle();
		Circle circle1 = new Circle();

		Map<Integer, Circle> map1 = new HashMap<Integer, Circle>();
		map1.put(100, circle);
		map1.put(222, circle1);

		System.out.println(map1.get(100));

		map1.replace(222, null);
		System.out.println(map1.get(222));

		Collection<Circle> collection = map1.values();
		System.out.println(collection.size());

		Iterator<Integer> iterator = map1.keySet()
				.iterator();

		while (iterator.hasNext()) {
			int key = iterator.next();
			Circle value = map1.get(key);
			System.out.println("Circle" + value);
		}

	}

	public static void parameterList() {
		Circle circle = new Circle();
		circle.setColor("blue");
		Circle circle2 = new Circle();

		List<Circle> list = new ArrayList<Circle>(2);

		list.add(circle);
		list.add(new Circle());
		list.add(circle);
		list.add(1, circle);

		Circle circle1 = list.get(1);

		System.out.println(circle1.getColor());

		System.out.println(list.get(1));
		// list.get(4);

		System.out.println(list.size());
		System.out.println(list.get(1));
	}

	public static void rawList() {
		List list = new ArrayList();

		list.add("list element");
		list.add("another list element");
		list.add(7);
		list.add(new Circle());

		Object thirdElement = list.get(3);
		if (thirdElement instanceof String) {

			String firstElement = (String) thirdElement;
			System.out.println("true");

		} else if (thirdElement instanceof Circle) {

			System.out.println("false");
		}

		String firstElement = (String) list.get(0);
		String substring = firstElement.substring(5);

		int number = (Integer) list.get(2);

		System.out.println(substring);
		System.out.println(number);
		Circle circle = (Circle) thirdElement;
		System.out.println(circle.draw());
	}
}
