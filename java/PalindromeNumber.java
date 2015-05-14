package code;

public class PalindromeNumber {

	public static boolean  isPalindrome(int number) {
		
		boolean result= false;
		char[] charified= Integer.toString(number).toCharArray();
		
		if (charified.length==1){
			return true;
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		
	}
}
