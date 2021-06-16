package lab4;

import java.util.Scanner;

public class StringTimes {

	public static void main(String[] args) {
		// Given a string and a non-negative int n,
		// return a larger string that is n copies 
		// of the original string.
		
		// create a scanner to take in a string and
		// create a scanner to take accept a number
		// make sure number is positive and whole
		// create a method that repeats the string the given number of times, printing it out
		Scanner inputString = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputSelection = new Scanner(System.in);
		
		
		System.out.println("Write a String: ");
		String writtenString = inputString.nextLine();
//		System.out.println(writtenString);
		System.out.println(" \n"
				+"Choose the number of times you want it printed:");
		double chosenNum = inputInt.nextDouble();
		int chosenNum2 = roundNumber(chosenNum);
		int verifiedNum = posNumber(chosenNum2);
		
		System.out.println(" \n" + "How would you like it printed out?\n" + "Type '1' for seperate lines.\n"
				+ "Type '2' for one long String");
		int selection = inputSelection.nextInt();
		switch (selection) {
		case 1:
			System.out.println("");
			repeatString(writtenString, verifiedNum);
			break;
		case 2:
			System.out.println("");
			System.out.println(repeatAsOne(writtenString, verifiedNum));
			break;
		default:
		}

		inputString.close();
		inputInt.close();
		inputSelection.close();
	}
// positive
	private static int posNumber(int usersNumber) {
		if (usersNumber < 0) {
			usersNumber = usersNumber * -1;
			return usersNumber;
		}
		else
			return usersNumber;
	}
// round off decimal
	private static int roundNumber(double usersNumber2) {
		int rounded = (int) Math.round(usersNumber2);
		return rounded;
	}
// method 1	
	private static void repeatString(String usersString, int multiplier) {
		for (int i = 0; i<multiplier; i++) {
			System.out.println(usersString);
		}
	}
// method 2	
	private static String repeatAsOne(String usersString2, int multiplier2) {
		String resultingString = usersString2;
		for (int i = 1; i < multiplier2; i++) {
			resultingString += usersString2;
		}
		return resultingString;
	}
}


