package Lab3;

import java.util.Arrays;

public class Question4F {

	public static void main(String[] args) {
		String theString = "bananas";
		
		System.out.println(rearrangeWord(theString));

	}

	public static String rearrangeWord(String inpStng) {
		char[] wordArray = inpStng.toCharArray();
		String repeating = "";
		String nonrepeating = "";
		int count = 0;
		
		for(int i = 0; i < wordArray.length; i++) {
			count = 0;
			for(int j = 0; j < wordArray.length; j++) {
				if (wordArray[i] == wordArray[j]) {
					count++;
				}
			}
			if (count <= 1) {
				nonrepeating += wordArray[i];
			}
			else
				repeating += wordArray[i];
		}
		char[] repeatArray = repeating.toCharArray();
		Arrays.sort(repeatArray);
		String sortRep = String.valueOf(repeatArray);
		
		String together = nonrepeating + sortRep;
		return together;
	}
}
