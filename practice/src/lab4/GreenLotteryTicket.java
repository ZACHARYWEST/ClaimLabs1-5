package lab4;

import java.util.Scanner;

public class GreenLotteryTicket {

	public static void main(String[] args) {		
		//use scanner to take in 3 int inputs
		//create an int method
		// if all the same, return 20
		// if 2 are the same, return 10
		// if none are the same, return 0
		// maybe add some text for fun

		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("You got a green lottery ticket!\n"
				+"What are the three numbers you choose?\n"
				+" \n"
				+"First number:");
		double firstNum = input1.nextDouble();
		System.out.println("Second number:");
		double secondNum = input2.nextDouble();
		System.out.println("Third number:");
		double thirdNum = input3.nextDouble();
		
		int confirmedOne = fixNumber(firstNum);
		int confirmedTwo = fixNumber(secondNum);
		int confirmedThree = fixNumber(thirdNum);
		
		System.out.println(" \n"
				+"You chose " + confirmedOne +", "+ confirmedTwo + ", and " + confirmedThree);
		input1.close();
		input2.close();
		input3.close();
		
		
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
		}
		
	}

	private static int posNumber(int usersNumber) {
		if (usersNumber < 0) {
			usersNumber = usersNumber * -1;
			return usersNumber;
		}
		else
			return usersNumber;
	}
	private static int roundNumber(double usersNumber2) {
		int rounded = (int) Math.round(usersNumber2);
		return rounded;
	}
	private static int fixNumber(double usersNumber3) {
		int adjusted = roundNumber(usersNumber3);
		int positive = posNumber(adjusted);
		return positive;
	}
	
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

}
