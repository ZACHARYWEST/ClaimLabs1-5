package lab5;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// create a char array, including spaces
		// create a method that erases the white space and returns the rest

		char[] arrayWithSpaces = {' ', 'Z', ' ', 'A', ' ', 'C', ' ', 'K', ' '};
		System.out.println(arrayWithSpaces);
		System.out.println(removeSpaces(arrayWithSpaces));
	}

	public static char[] removeSpaces(char[] enteredArray) {
		String toString = new String(enteredArray);
		char[] updatedArray = toString.replaceAll("\\s", "").toCharArray();
		return updatedArray;
	}
}
