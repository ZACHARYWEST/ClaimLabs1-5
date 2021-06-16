package lab5;

import java.util.Scanner;

public class CountLettera {

	public static void main(String[] args) {
		//create a char array
		//create a method that counts the number of times the letter 'a' occurs in the given array
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String userString = input.nextLine();
		System.out.println(userString);
		
		char[] userArray = userString.toCharArray();
		System.out.println(aCounter(userArray));
		
		char[] theArray = {'a', 'b', 'c', 'a', 't', 'c', 'l', 'a', 'i', 'm'};
		char[] two = {'a', 'b', 'a'};
		
//		System.out.println(aCounter(theArray));
//		System.out.println(aCounter(two));

	}

	public static int aCounter(char placeholder[]) {
		int count = 0;
		String stringIt = new String(placeholder);
		for (int i = 0; i < stringIt.length(); i++) {
			if (stringIt.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
}
