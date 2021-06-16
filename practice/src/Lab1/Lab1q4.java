package Lab1;

public class Lab1q4 {

	public static void main(String[] args) {
		boolean red = false;
		boolean blue = false;
	
	System.out.println(xor(red, blue));	
		
		
	}

	public static boolean xor(boolean bool1, boolean bool2) {
		if (bool1 == true && bool2 == false) {
			return true;
		}
		if (bool2 == true && bool1 == false) {
			return true;
		}
		return false;
	}
	
//	public static boolean xor2(boolean bool1, boolean bool2) {
//		boolean result = bool1 ^ bool2;
//		return result;
//	}
	
//	public static boolean xor3(boolean bool1, boolean bool2) {
//		if (bool1 == bool2) {
//			return false;
//		}
//		return true;
//	}
	
//	public static boolean xor4(boolean bool1, boolean bool2) {
//		
//		return ((bool1 || bool2) & ! (bool1 && bool2));
//	// true if   bool1 OR bool2  &NOT bool1 AND bool2
//	}
}
