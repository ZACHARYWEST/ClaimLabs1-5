package Lab2;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter of the alphabet to get unicode: ");
		char theLetter = input.next().charAt(0);
		alphaNum(theLetter);

	}
	public static void alphaNum(char letter) {
		int num = Character.getNumericValue(letter);
		System.out.println("The numeric value of " + letter + " is " + num + ".");
	}
	
}
