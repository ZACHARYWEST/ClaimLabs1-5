package lab5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateCharInArray {

	public static void main(String[] args) {
		// Write a method to find duplicate characters in a char array
		System.out.println("Type in a String:");
		Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
       
        findDuplicates(sentence);

        input.close();
    }
	
	public static void findDuplicates(String enteredString) {
        char[] chars = enteredString.toCharArray();
        int length = enteredString.length();
        int count = 0;
        
        for(int i = 0; i <length; i++) {  
            count = 1;  
            for(int j = i+1; j <length; j++) {  
                if(chars[i] == chars[j] && chars[i] != ' ') {  
                    count++;  
                    //Set string[j] to ? to avoid printing visited character  
                    chars[j] = '?';  
                }  
            }  
            //A character is considered a duplicate if count is greater than 1  
            if(count > 1 && chars[i] != '?')  
                System.out.println(chars[i]);  
        }  
        
        
	}
}
