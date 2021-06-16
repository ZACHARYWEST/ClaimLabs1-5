package Lab1;

import java.util.Scanner;

public class Lab1q1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int firstNumber = in.nextInt();
		System.out.println("Enter another whole number: ");
		int secondNumber = in.nextInt();
		System.out.println("Enter one more whole number: ");
		int thirdNumber = in.nextInt();
		
		max3(firstNumber, secondNumber, thirdNumber);
	}

	public static void max3(int firstInteger, int secondInteger, int thirdInteger) {
		System.out.println("The three integers are " + firstInteger + ", " + secondInteger + ", and " + thirdInteger);
		//Formulas
		if (firstInteger>secondInteger && firstInteger>thirdInteger) {
			System.out.println(firstInteger + " is the largest number.");
		}
			if (secondInteger>firstInteger && secondInteger>thirdInteger){
				System.out.println(secondInteger + " is the largest number.");
			}
			if (thirdInteger > firstInteger && thirdInteger > secondInteger){
				System.out.println(thirdInteger + " is the largest number.");}
		}
	
	}


