package Lab2;

import java.util.Scanner;

public class question6 {

//	Write a method to prompt the user for a double 
//	then display the value as a whole number. eg user 
//	enter "15 .8" result is: "You entered 15.8, the "
//	+ "new value is 16". eg user enter "15 .4"
//	result is: "You entered 15.4, the new value is 15".
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number with a decimal value: ");
		roundNum(input.nextDouble());
	}
	public static void roundNum(double number) {
		int rounded = (int) Math.round(number);
		System.out.println("You entered " + number + ", the new value is " + rounded);
	}
}
