package challengeperson;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	
	private static List<Person> personList = new ArrayList<Person>();
	
	public static void populateList(Person[] people) {	
		for (int i = 0; i < people.length; i++) {
			personList.add(people[i]);
		}
	}
	
	public static void addSinglePerson(Person person) {
			personList.add(person);
	}

	public static void printAll() {
		for (Person per : personList) { System.out.println(getPerson(per)); }
		System.out.println();
	}

	public static String getPerson(Person person) {
		return person.toString();
	}
	
	public static void findPerson(Person name) {
		int i = personList.indexOf(name);
		
		if (i >= 0) { System.out.println(personList.get(i)); }
		else { System.out.println("Person Not Found!!!"); }
	}
}
