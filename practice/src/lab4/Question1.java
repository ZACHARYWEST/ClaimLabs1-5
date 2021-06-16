package lab4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		//take in two single digit numbers
		//if negative, convert to positive
		//if their sum is < 10, return sum
		//if their sum is > 10, return the first number
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter two single-digit numbers: \n"
							+ "(Note: Negatives will be converted to Positives)");
		int firstNum = input1.nextInt();
		int secondNum = input2.nextInt();
		boolean verified = verifyNumbers(firstNum, secondNum);
		
		if (verified == true) {
			int result = sumOrNot(firstNum, secondNum);
			System.out.println("Your result is " + result);
		}
		else 
		if (verified == false){
			System.out.println("Those are invalid numbers.");
		}
		input1.close();
		input2.close();
	}

	private static boolean verifyNumbers(int firstV, int secondV) {
		if(firstV >= 10 || secondV >= 10) {
//			System.out.println("wrong entry");
			return false;
		}
		else
		return true;
	}
	
	private static int convertNegatives(int number) {
		if (number < 0) {
			int newNum = number * (-1);
			return newNum;
		}
		else
		return number;
	}
	private static int sumOrNot(int usersFirst, int usersSecond) {
		
		int first = convertNegatives(usersFirst);
		int second = convertNegatives(usersSecond);
		if (first + second < 10) {
			int sum = first + second;
			return sum;
		}
		return first;
	}
}
