package challengeperson;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personOne = new Person("Person One", 25, "Tech Assistant");
		Person personTwo = new Person("Person Two", 30, "Tech Specialist");
		Person personThree = new Person("Person Three", 35, "DevOps Engineer");
		Person personFour = new Person("Person Four", 45, "DevOps Manager");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(personOne);
		personList.add(personTwo);
		personList.add(personThree);
		
		Person[] array = {personOne, personTwo, personThree};
		
		PersonManager.populateList(array);

		// Adding a single person here
		PersonManager.addSinglePerson(personFour);
		
		System.out.println("Printing a single person: ");
		System.out.println(PersonManager.getPerson(personTwo) + "\n");

		System.out.println("Printing each person in the Person List");
		PersonManager.printAll();
		
		System.out.println("Finding a person in the list");
		PersonManager.findPerson(personTwo);
	}
}
