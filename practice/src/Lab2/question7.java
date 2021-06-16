package Lab2;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		System.out.println("Enter a year to determine if it is a leap year: yyyy");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		isLeap(year);
	
		
	}

	public static void isLeap(int input) {
		
		if (input % 4 == 0) {
			if (input % 100 == 0) {
				if (input % 400 == 0) {
					System.out.println("That is a leap year");
				} else {
					System.out.println("That is not a leap year.");
				}
			} else {
				System.out.println("That is a leap year");
			}
		} else {
			System.out.println("That is not a leap year.");
		}
	}

}		