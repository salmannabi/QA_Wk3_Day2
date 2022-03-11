package stringmanipulation;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOne = "yesterday it was raining";
		String strTwo = "today it is sunny";
			
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
		System.out.println(findString("i am here", "am h"));
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
	}
	
	public static boolean findString(String str, String sub) {
		boolean found = false;
		int j = 0;
		
		for (int i = 0; i < str.length(); i ++) {
			if (j == sub.length()) {
				return true;
			} else if (j < sub.length() && str.charAt(i) == sub.charAt(j)) {
				found = true;
				j++;
			} else {
				found = false;
				j = 0;
			}
		}
		return false;
	}
}
