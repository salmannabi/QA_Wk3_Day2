package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(3);
		myList.add(5);
		myList.add(7);
		myList.add(9);
		myList.add(11);
		myList.add(13);
		myList.add(15);
		myList.add(17);
		myList.add(19);
		
		// Printing entire array list
		System.out.println("This is myList");
		System.out.println(myList);
		System.out.println();
		
		//Printing elements of array list via normal for-loop
		System.out.println("Normal for-loop");
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// Printing elements of array list via enhanced for-loop
		System.out.println("Enhanced for-loop");
		for (int i : myList) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("Getting element #5");
		System.out.println(myList.get(5));
		System.out.println();

		System.out.println("Setting element #5 to 21");
		myList.set(5, 21);
		System.out.println(myList);
		System.out.println();
		
		myList.remove(2);
		System.out.println("myList after removing element #2");
		System.out.println(myList);
		System.out.println();
		
		Collections.sort(myList);
		System.out.println("myList after sorting by ascending order");
		System.out.println(myList);
		System.out.println();
		
		Collections.reverse(myList);
		System.out.println("myList after sorting by descending order");
		System.out.println(myList);
		System.out.println();
		
		Collections.swap(myList, 1, 4);
		System.out.println("myList after sorting element 1 and 4");
		System.out.println(myList);
		System.out.println();
		
		myList.clear();
		System.out.println("myList after clearing");
		System.out.println(myList);
		System.out.println();
	}
}
