package Lab1;

public class Lab1q7 {

	public static void main(String[] args) {
		
		
		int n = 20;
		
		
		System.out.println(isPrime(n));

	}

	public static boolean isFactor(int k, int n) {
		if (n%k==0) {
			return true;}		
		return false;}
	
	public static boolean isPrime(int n) {
		
		 for (int i = 2; i < n; i++) {
			 if (isFactor(i, n)){
				 return false; }
		 }
		return true;
	}
}
