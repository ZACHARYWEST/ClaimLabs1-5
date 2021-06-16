package lab4;

import java.util.Scanner;

public class SquirrelsPaloAlto {

	public static void main(String[] args) {

		// use a scanner for two inputs
		// first is an integer value of temperature
		//second is a T/F of if it is summer
		//if it IS summer, the squirrels play if the temp is between 60 and 100
		//if it is NOT summer, they play if the temp is between 60 and 90
		// print a result
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("     What is the temperature in Palo Alto?");
		float temperature = input1.nextFloat();
		System.out.println("     Is it summer? \n"
						+"answer in the form of 'yes' or 'no'");
		String summerYesNo1 = input2.next().toLowerCase();
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
		input1.close();
		input2.close();
	}

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
}
