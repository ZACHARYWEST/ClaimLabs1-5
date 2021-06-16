package lab4;

import java.util.Scanner;

public class Lab4Collection {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		System.out.println("   Welcome.\n" + "Please chose an option.\n" + "Option 1: Number thing.\n"
						+ "Option 2: Squirrels of Palo Alto.\n" + "Option 3: Green Lottery Ticket.\n"
						+ "Option 4: Count the number of 'xx's.\n" + "Option 5: Repeat a String.\n");
		
		int menuChoice = input1.nextInt();
		switch(menuChoice) {
		case 1:
			System.out.println("Number Thing\n"+"**************");
			System.out.println("    Enter two single-digit numbers: \n"
					+ "   (Note: Negatives will be converted to Positives)");
			int firstNum = input2.nextInt();
			int secondNum = input3.nextInt();
			int one = posNumber(firstNum);
			int two = posNumber(secondNum);
			boolean verified = verifyNumbers(one, two);
			
			if (verified == true) {
				int result = sumOrNot(one, two);
				System.out.println("Your result is " + result);
			}
			else
				System.out.println("imporoper numbers entered");
			break;
		case 2:
			System.out.println("Squirrels of Palo Alto\n"+"******************");
			System.out.println("     What is the temperature in Palo Alto?");
			float temperature = input2.nextFloat();
			System.out.println("     Is it summer? \n"
							+"answer in the form of 'yes' or 'no'");
			String summerYesNo1 = input3.next().toLowerCase();
			char summerYesNo2 = summerYesNo1.charAt(0);
			
			switch(summerYesNo2) {
			case 'y':
				squirrelPlay(temperature, 'y');
				break;
			case 'n':
				squirrelPlay(temperature, 'n');
				break;
			default:
				System.out.println("input not understood");
				break;
			}
			if (temperature > 130) {
				System.out.println("It's too hot outside. The squirrels are cooked.");
			}
			if (temperature < -20) {
				System.out.println("It's too cold outside. The squirrels are frozen.");
			}
			break;
		case 3:
			System.out.println("Green Lottery Ticket\n"+"*********************");
			System.out.println("You got a green lottery ticket!\n"
					+"What are the three numbers you choose?\n"
					+" \n"
					+"First number:");
			double lotOne = input2.nextDouble();
			System.out.println("Second number:");
			double lotTwo = input3.nextDouble();
			System.out.println("Third number:");
			double lotThree = input4.nextDouble();
			
			int confirmedOne = fixNumber(lotOne);
			int confirmedTwo = fixNumber(lotTwo);
			int confirmedThree = fixNumber(lotThree);
			
			System.out.println(" \n"
					+"You chose " + confirmedOne +", "+ confirmedTwo + ", and " + confirmedThree);
			
			switch(lottery(confirmedOne, confirmedTwo, confirmedThree)) {
			case 0:
				System.out.println("The ticket says 0... sorry, that's a loss!");
				break;
			case 10:
				System.out.println("The ticket says 10. You get a small prize!");
				break;
			case 20:
				System.out.println("The ticket says 20! You won the lottery!!");
				break;
			default:
				break;
			}
			break;
		case 4:
			System.out.println("Count the number of xx's\n"+"*****************");
			System.out.println("Type a series of characters with lots of X's\n"+"For example:  xx aBcxXx xx ");
			String initialString = input2.nextLine();
			String howManyXX = initialString.toLowerCase().trim();
			
			int resultingNumber = checkForXX(howManyXX);
			
			System.out.println("The number of 'xx' located in the String '"+initialString+"' is " + resultingNumber);
			break;
		case 5:
			System.out.println("Repeat a String\n"+"****************");
			System.out.println("Write a String: ");
			String writtenString = input2.nextLine();
			System.out.println(" \n"
					+"Choose the number of times you want it printed:");
			double chosenNum = input3.nextDouble();
			int chosenNum2 = fixNumber(chosenNum);
			
			System.out.println(" \n" + "How would you like it printed out?\n" + "Type '1' for seperate lines.\n"
					+ "Type '2' for one long String");
			int selection = input4.nextInt();
			switch (selection) {
			case 1:
				System.out.println("");
				repeatString(writtenString, chosenNum2);
				break;
			case 2:
				System.out.println("");
				System.out.println(repeatAsOne(writtenString, chosenNum2));
				break;
			default:
				System.out.println("input not correct");
				break;
			}
			break;
		default:
			System.out.println("input not understood");
			break;
		}

	}

//	round off decimals
	private static int roundNumber(double roundThis) {
		int rounded = (int) Math.round(roundThis);
		return rounded;
	}
// convert negative numbers into positives
	private static int posNumber(int usersNumber) {
		if (usersNumber < 0) {
			usersNumber *= -1;
			return usersNumber;
		}
		else
			return usersNumber;
	}
// verify if numbers are between 0 and 10	
	private static boolean verifyNumbers(int firstV, int secondV) {
		if(firstV >= 10 || secondV >= 10) {
			return false;
		}
		else
		return true;
	}
// do that question 1 thing
	private static int sumOrNot(int usersFirst, int usersSecond) {
		
		int first = posNumber(usersFirst);
		int second = posNumber(usersSecond);
		if (first + second < 10) {
			int sum = first + second;
			return sum;
		}
		return first;
	}
// squirrel method
	private static void squirrelPlay(float temp, char summer) {
		if (summer == 'y') {
			if (temp >= 60 && temp <= 100) {
				System.out.println("The squirrels are out playing.");
			}
			else {
				System.out.println("The squirrels are hiding.");
			}
		}
		else
			if (summer == 'n') {
				if (temp >=60 && temp<= 90) {
					System.out.println("The squirrels are out playing.");
				}
				else {
					System.out.println("The squirrels are hiding.");
				}
			}
	}
// pos and round together
	private static int fixNumber(double usersNumber3) {
		int adjusted = roundNumber(usersNumber3);
		int positive = posNumber(adjusted);
		return positive;
	}
// lottery
	private static int lottery(int alpha, int bravo, int charlie) {
		if (alpha == bravo && bravo == charlie) {
			return 20;
		}
		else
			if (alpha == bravo || bravo == charlie || charlie == alpha) {
				return 10;
			}
		return 0;
	}
// count xx's
	private static int checkForXX(String theString) {
		int count = 0;
		for (int i = 1; i < theString.length(); i++) {
			if (theString.charAt(i) == 'x' && theString.charAt(i-1) == 'x') {
				count++;
			}
		}
		return count;
	}
//repeat the string on multiple lines
	private static void repeatString(String usersString, int multiplier) {
		for (int i = 0; i<multiplier; i++) {
			System.out.println(usersString);
		}
	}
//repeat the string as one long string
	private static String repeatAsOne(String usersString2, int multiplier2) {
		String resultingString = usersString2;
		for (int i = 1; i < multiplier2; i++) {
			resultingString += usersString2;
		}
		return resultingString;
	}
	
}




