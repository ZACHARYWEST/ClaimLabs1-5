package Lab1;

public class Lab1q5 {

	public static void main(String[] args) {

		System.out.println(isFactor(5, 10));
	}

	public static boolean isFactor(int k, int n) {
		return (n % k == 0);
	}
}