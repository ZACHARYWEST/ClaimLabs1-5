package Lab2;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner (System.in);
		Scanner input2 = new Scanner (System.in);
		System.out.println("Enter the Base and the Height of a triangle.");
		System.out.println("Base: ");
		double base = input1.nextDouble();
		System.out.println("Height: ");
		double height = input2.nextDouble();
		triangleArea(base, height);
		
	}
	public static void triangleArea(double b, double h) {
		double area = (b * h)/2;
		System.out.println("The area of the triangle is: " + area);
	}
	

}