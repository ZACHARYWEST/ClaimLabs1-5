package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
			//Write a method to remove duplicate characters from a string.
		
			//Create a Scanner, the prompt user to enter a word, and take that word as a variable.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word. All duplicate letters will be removed.");
		String enteredWord = input.next();
		
			// turn the String entered by the user into an array of char
		char whatever[] = enteredWord.toCharArray();
			// also count the number of letters in the word, so that the method can use it as an integer
		int length = enteredWord.length();
			// create a new String that calls the method
		String result = removeDuplicates(whatever, length);
			// display the result
		System.out.println(result);

//		//index          0  1  2
//		int numbers[] = {1, 2, 3};
//		int len = numbers.length;
	}
										
	public static String removeDuplicates(char word[], int d) { // create the new method. the inputs are char, consisting of an array, and an integer		
		int count = 0;					// create a new int that starts at zero. this will add to the word array length
			
		for (int i = 0; i<d; i++) {		// create a for-loop. the int i starts at zero. the comparison is to the int d entered above. the increment is one, so i++.
			int j; 						// create an additional int called j.					
			for ( j = 0; j<d; j++) {	// run the same for-loop as above to compare them and see if word[i] is still present
				if(word[i] == word[j]) {
					break; 				// if they are the same, break it.
				}
			}
			if (j == i) {  				// if word[i] is not present, check if j and i are the same.
				word[count++] = word[i];// increase the count in the word array by one, and make it the new word[i]
			}
		}								
		return String.valueOf(Arrays.copyOf(word, count));
	}		// return it as a string with the value of a copy of the array of "word". count tells it how many letters it should be.
	
}
