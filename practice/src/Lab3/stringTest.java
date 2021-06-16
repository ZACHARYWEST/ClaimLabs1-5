package Lab3;

public class stringTest {

	public static void main(String[] args) {
		//defining a String
		var bankAccount = "$50";
		String creditCard = bankAccount;
		System.out.println(creditCard);
		
		//counting length
		String length = "hello";
		System.out.println(length.length());
		
		//does not work on primitive data types
//		int longNum = 56478;
//		System.out.println(longNum.length());
	}

}
