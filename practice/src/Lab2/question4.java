package Lab2;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
//		Write a method to prompt the user for an Integer 
//		then display the same value with one decimal place. 
//		eg user enter "15 " result is: "You entered 15, "
//				+ "the new value is 15.0".
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number: ");
			newNum(input.nextInt());
	}
	public static void newNum(int num) {
		System.out.println("You entered " + num);
		double add0 = num;
		System.out.println("The new value is " + add0);
	}
	
}
