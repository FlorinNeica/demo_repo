package automation.oop4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsExamples {

	public static void main(String[] args) {
		// arrays();
		lists();
		// sets();
		// maps();
	}

	private static void maps() {

		HashMap<String, String> myMap = new HashMap<>();

		myMap.put("34", "value for key 34");
		myMap.put("89", "value for key 89");
		myMap.put("6", "CTRL+D");
		myMap.put("some key", "CTRL+X");

		System.out.println(myMap.get("34"));
		System.out.println(myMap.get("some key"));

		for (String key : myMap.keySet()) {
			String theValue = myMap.get(key);
			System.out.println(theValue);
		}

		myMap.remove("6");

		System.out.println("-----");

		for (String key : myMap.keySet()) {
			String theValue = myMap.get(key);
			System.out.println(theValue);
		}
	}

	private static void sets() {

		HashSet<String> mySet = new HashSet<>();

		mySet.add("element1");
		mySet.add("element1");

		System.out.println(mySet.size());

		mySet.remove("element1");

		System.out.println(mySet.size());

	}

	private static void lists() {

		ArrayList<String> myList = new ArrayList<>();

		myList.add("element1");
		myList.add("element2");
		myList.add("7");

		System.out.println(myList.get(0));

		myList.add(0, "the real element1");

		System.out.println(myList.get(0));

		System.out.println(myList.size() + " elements in list");

		myList.remove(2);

		System.out.println(myList.size() + " elements in list");

		for (String s : myList) {
			System.out.println(s);
		}
	}

	private static void arrays() {

		int[] numbers = { 1, 2, 56, 34, 44 };
		String[] arrayOfStrings = { "element 1", "element 2" };

		System.out.println(arrayOfStrings[0]);

		arrayOfStrings[0] = "another element";

		System.out.println(arrayOfStrings[0]);

		double[] someDoubles = new double[3];

		someDoubles[0] = 2.3;
		someDoubles[1] = 2.345;
		someDoubles[2] = 9.13;

		System.out.println(someDoubles[2]);

		for (String s : arrayOfStrings) {
			System.out.println(s);
		}

	}
}