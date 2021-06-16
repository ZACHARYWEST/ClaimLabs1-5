package Lab2;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Check a number: ");
		evenOdd(input.nextInt());
	}
	public static void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("That is an even number.");
		}
		else {System.out.println("That is an odd number.");}
	}
	
}
