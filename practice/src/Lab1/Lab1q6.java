package Lab1;

public class Lab1q6 {

	public static void main(String[] args) {

	System.out.println(isPerfect(28));
	//System.out.println(isPerfect2(25));

	}
	
	public static boolean isFactor(int k, int n) {
		return (n % k == 0);
	}

	public static boolean isPerfect(int n) {
		int sum = 0;
		int k = 1;
		boolean w = isFactor(k, n);

		if (n == 0) {
			return false;
		}
		while (sum < n && w == true) {
			sum = sum + k;
			k++;
		}

		if (sum == n) {
			return true;
		}

		return false;
	}
	
	//using a for loop. (It isn't working)
	
//	public static boolean isPerfect2(int n) {
//		if (n == 0) {
//			return false;
//		}
//		int sum = 0;
//		for (int i = 1; 1<n; i++) {
//			if(isFactor(i, n)) {
//				sum = sum + i;
//			}
//		}
//		if (sum == n) {
//				return true;
//			}
//		
//		return false;
//	}
	
}
