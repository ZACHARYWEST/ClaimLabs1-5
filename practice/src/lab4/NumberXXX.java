package lab4;

public class NumberXXX {

	public static void main(String[] args) {
		//Count the number of "xx" in the given string.
		//We'll say that overlapping is allowed, so 
		//"xxx" contains 2 "xx".
		
		//no scanner, just create a string and add X's
		//reduce the string to all lower case, trim
		//create a method that has a counter and a for-loop which adds to the counter if 'xx' is found
		//if char at i == x and char at i-1 == x, increase count
		
		String initialString = " xx aBcxXx xx ";
		String howManyXX = initialString.toLowerCase().trim();
		
		int resultingNumber = checkForXX(howManyXX);
		
		System.out.println("The number of 'xx' located in the String '"+initialString+"' is " + resultingNumber);

	}

	private static int checkForXX(String theString) {
		int count = 0;
		for (int i = 1; i < theString.length(); i++) {
			if (theString.charAt(i) == 'x' && theString.charAt(i-1) == 'x') {
				count++;
			}
		}
		return count;
	}
}
