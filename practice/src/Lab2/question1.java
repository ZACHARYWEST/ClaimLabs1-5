package Lab2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class question1 {

	public static void main(String[] args) {
		
	checkDoubleAndRun();	
		


	}
	
	private static void checkDoubleAndRun() {
		System.out.println("Enter the radius of a circle: ");
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			try {	
				double userNum = input.nextDouble();
				done = true;
				circle(userNum);
			} 
			catch(InputMismatchException e) {
				System.out.println("No... enter a number...");
				input.nextLine();
			}
		}
		input.close();
	}
	
	private static void circle(double radius) {
		double area = (radius * radius) * Math.PI;
		double circumference = (2 * Math.PI) * radius;
		System.out.println("The area of the circle is: " + area);
		System.out.println("The circumference of the circle is: " + circumference);
	}
	

}