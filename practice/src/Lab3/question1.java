package Lab3;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner inputWord = new Scanner(System.in);
		Scanner inputLetter = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = inputWord.next();
		System.out.println("Enter the letter you want removed: ");
		char letter = inputLetter.next().charAt(0);
		String replaced = newWord(word, letter);
		System.out.println("The word is now: " + replaced);
	}

	public static String newWord(String inWord, char letter) {
		String letterAsString = Character.toString(letter);		//convert the char into a String
		String stringNew = inWord.replace(letterAsString, "");	//replace the letter with a blank space
		return stringNew;
	}

}
