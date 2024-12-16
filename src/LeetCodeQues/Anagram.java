package LeetCodeQues;


import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		if(string1 != string2) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {

	}
	
}
