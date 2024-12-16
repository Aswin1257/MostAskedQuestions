package LeetCodeQues;

public class ValidPalindrome {
	public static boolean validPalindrome(String str) {
		str = str.replace(" ", "");
		for(int i =0;i<str.length()-1;i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String string = "race car";
		System.out.println(validPalindrome(string));
	}
}

