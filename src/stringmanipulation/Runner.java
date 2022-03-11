package stringmanipulation;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOne = "yesterday it was raining";
		String strTwo = "today it is sunny";
		
//		for (int i = strOne.length() - 1; i >= 0; i--) {
//			System.out.print(strOne.charAt(i));
//		}
//		
		String strThree = (strOne + strTwo).toUpperCase();
		System.out.println(strThree);
		
		String strFour = (strTwo.substring(0, 12) + strOne.substring(17)).toUpperCase();
		System.out.println(strFour);
		
		System.out.println("\nExercise 2");
		System.out.println("\nMethod 1:");
		System.out.println(("Number of Words in strOne: " + returnWords(strOne)));
		
		System.out.println("\nMethod 2:");
		printVertical(strOne);
		System.out.println();
		
		System.out.println("\nMethod 3:");
		printReverseVertical(strOne);
		
		System.out.println("\nMethod 4:");
		
		
	}
	
	public static int returnWords(String str) {
		int numOfW = 0;
		if (str.charAt(0) != ' ') { numOfW = 1; }
		for (int i = 0; i < str.length(); i++) {
			if (numOfW == 0 && str.charAt(i) == ' ') { continue; }
			else if (numOfW == 0) { numOfW = 1; }
			
			if (str.charAt(i) == ' ' && ((str.charAt(i + 1) != ' ' || i == (str.length() - 1)))) 
			{ numOfW++; }
		}
		
		return numOfW;
	}
	
	public static void printVertical(String str) {
		boolean begin = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && begin == false) { continue; }
			else { begin = true; }
			
			if (str.charAt(i) == ' ' && ((str.charAt(i + 1) != ' ' || i == (str.length() - 1)))) 
			{ System.out.println(); }
			else { System.out.print(str.charAt(i)); }
		}
	}
	
	public static void printReverseVertical(String str) {
		String[] strArray = new String[returnWords(str)];
		int strArrayPos = 0;
		String word = "";
		
		// Build the strArray
		boolean begin = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && begin == false) { continue; }
			else { begin = true; }
			
			if (str.charAt(i) != ' ') { word += str.charAt(i); }
			else if (str.charAt(i) == ' ' && ((str.charAt(i + 1) != ' ' || i == (str.length() - 1)))) { 
				strArray[strArrayPos] = word;
				word = "";
				strArrayPos++;
			}
			
			strArray[strArrayPos] = word;
		}
		
		// Reverse the strArray
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.println(strArray[i]);
		}
		
//		// First reverse the string
//		String reverse = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			reverse += str.charAt(i);
//		}
//		return reverse;
	}
	
	public static boolean findString(String str, String sub) {
		boolean found = false;
		
		
		return false;
	}


//    Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
//
//    Concatenate both values, capitalise both strings and print out the result.
//    The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
//    Solution
//    Now use the substring method to print out: `TODAY IT IS RAINING`
//    Solution
//
//    For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
//
//    Method 1 - When given a String, count and return how many words there are in that String.
//    Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
//    Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
//    Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.

}
