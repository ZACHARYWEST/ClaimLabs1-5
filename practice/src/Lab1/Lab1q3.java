package Lab1;

import java.util.Scanner;

public class Lab1q3 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int firstNumber = in.nextInt();
		System.out.println("Enter another whole number: ");
		int secondNumber = in.nextInt();
		System.out.println("Enter one more whole number: ");
		int thirdNumber = in.nextInt();
		
		System.out.println("largest number is " + max3(firstNumber, secondNumber, thirdNumber));
		System.out.println("smallest number is " + min3(firstNumber, secondNumber, thirdNumber));
		System.out.println("The Median is " + median3(firstNumber, secondNumber, thirdNumber));
	}

	public static int max3(int firstInteger, int secondInteger, int thirdInteger) {
		
		if (firstInteger>=secondInteger && firstInteger>=thirdInteger) {
			int max = firstInteger;
			return max;
		}
			if (secondInteger>=firstInteger && secondInteger>=thirdInteger){
				int max = secondInteger;
				return max;
			}
			if (thirdInteger>=firstInteger && thirdInteger>=secondInteger){
				int max = thirdInteger;
				return max;
				}
		return max3(0, 0, 0);
		}
	
	public static int min3(int firstInteger, int secondInteger, int thirdInteger) {
		
		if (firstInteger<=secondInteger && firstInteger<=thirdInteger) {
			int min = firstInteger;
			return min;
		}
			if (secondInteger<=firstInteger && secondInteger<=thirdInteger){
				int min = secondInteger;
				return min;
			}
			if (thirdInteger<=firstInteger && thirdInteger<=secondInteger){
				int min = thirdInteger;
				return min;
				}
		return min3(0, 0, 0);
		}
	
	public static int median3(int firstInteger, int secondInteger, int thirdInteger) {
		int sum = firstInteger + secondInteger + thirdInteger;
		int max = max3(firstInteger, secondInteger, thirdInteger);
		int min = min3(firstInteger, secondInteger, thirdInteger);
		
		int median = sum - max - min;
		
		return median;	
		}
	}



