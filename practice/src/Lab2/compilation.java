package Lab2;

import java.util.Scanner;

public class compilation {

	public static void main(String[] args) {
		Scanner selection = new Scanner(System.in);
		String welcome = "Welcome. Choose an option.\n"
						+"Option 1: Find the area and circumference of a circle.\n"
						+"Option 2: Find the area of a triangle.\n"
						+"Option 3: Check if a number is even or odd.\n"
						+"Option 4: Convert an integer to a double.\n"
						+"Option 5: Find the ASCII value of a letter.\n"
						+"Option 6: Round a number with a decimal in it.\n"
						+"Option 7: Check if a year is a leap year.\n";						
		System.out.println(welcome);
		int choice = selection.nextInt();
		switch (choice) {
		case 1:
			circle();
			break;
		case 2:
			triangleArea();
			break;
		case 3:
			evenOdd();
			break;
		case 4:
			newNum();
			break;
		case 5:
			alphaNum();
			break;
		case 6:
			roundNum();
			break;
		case 7:
			isLeap();
			break;
		default:
			System.out.println("unable to process");
			break;
		}

	}
//1
	private static void circle() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double rad = input.nextDouble();
		double area = (rad * rad) * Math.PI;
		double circumference = (2 * Math.PI) * rad;
		System.out.println("The area of the circle is: " + area);
		System.out.println("The circumference of the circle is: " + circumference);
	}
//2	
	private static void triangleArea() {
		Scanner input1 = new Scanner (System.in);
		Scanner input2 = new Scanner (System.in);
		System.out.println("Enter the Base and the Height of a triangle.");
		System.out.println("Base: ");
		double b = input1.nextDouble();
		System.out.println("Height: ");
		double h = input2.nextDouble();
		double area = (b * h)/2;
		System.out.println("The area of the triangle is: " + area);
	}
//3	
	private static void evenOdd() {
		Scanner input = new Scanner(System.in);
		System.out.println("Check a number: ");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("That is an even number.");
		}
		else {System.out.println("That is an odd number.");}
	}
//4	
	private static void newNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		System.out.println("You entered " + num);
		double add0 = num;
		System.out.println("The new value is " + add0);
	}
//5
	private static void alphaNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter of the alphabet: ");
		char letter = input.next().charAt(0);
		int num = Character.getNumericValue(letter);
		System.out.println("The numeric value of " + letter + " is " + num + ".");
	}
//6
	private static void roundNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number with a decimal value: ");
		double number = input.nextDouble();
		int rounded = (int) Math.round(number);
		System.out.println("You entered " + number + ", the new value is " + rounded);
	}
//7
	private static void isLeap() {
		System.out.println("Enter a year to determine if it is a leap year: ");
		Scanner input7 = new Scanner(System.in);
		int year = input7.nextInt();
		if (year%4 == 0) {
			if (year%100 == 0) {
				if (year%400 == 0) {
					System.out.println("That is a leap year");
				}
				else {System.out.println("That is not a leap year.");}
			}
			else {System.out.println("That is a leap year");}
		}
		else {System.out.println("That is not a leap year.");}
	}
}
