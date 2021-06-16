package lab5;

import java.util.Scanner;
import java.util.*;


public class reverseOrder {
	static void reverse(String a[]) {
		Collections.reverse(Arrays.asList(a));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String yourString = input.nextLine();
		reverseOrder(yourString);

		input.close();
	}

	public static void reverseOrder(String usersString) {
		String[] words = usersString.split("\\W+");
		reverse(words);
		StringBuffer reversed = new StringBuffer();
		
		for(int i = 0; i < words.length; i++) {
			reversed.append(words[i] + " ");
		}
		System.out.println(reversed);
	}
}
