package Lab3;

import java.util.Scanner;

public class question3 {
	//Write a program to count the number of vowels and consonants in a string. 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create a scanner.
		System.out.println("Enter a word:");	// prompt user for a word.
		String enteredWord = input.next();		// users word becomes a string variable
		int wordLength = enteredWord.length();	// count the number of characters in the word
		
		int vowels = vowelsCount(enteredWord, wordLength); // call the method to create an integer
		int consonants = wordLength - vowels;	// the remaining letters must be consonants
		
		System.out.println("The number of vowels is " + vowels + " and the number of consonants is " + consonants); // print results

	}
	public static int vowelsCount(String word, int n) {	// create a new method
		int count = 0;									// create a variable for counting
		word = word.toLowerCase().trim();						// change all the letters to lower case to avoid errors
//		char chars[] = word.toCharArray();				// create an array that holds all of the letters of the word
//		int i = 0;										// put the assignment here because it doesn't work in the for loop for some reason
		for (int i = 0; i<n; i++) {								// create a for loop that runs froom the first char (0) to the last (n)
			if (word.charAt(i) == 'a'					// inside the for-loop, create an if statement that checks i for a vowel
					|| word.charAt(i) == 'e'
					|| word.charAt(i) == 'i'
					|| word.charAt(i) == 'o'
					|| word.charAt(i) == 'u'
					|| word.charAt(i) == 'y') {
				count++;								// if the checked char was a vowel, increase the count by 1. repeat until i=n
			}
		}
		return count;									// return the number from count
	}
	
//	public static int consCount(int total, int vowel) {
//		int cons = total - vowel;
//		return cons;
//	}
	
}
