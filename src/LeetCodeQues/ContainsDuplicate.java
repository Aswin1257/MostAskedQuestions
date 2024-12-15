package LeetCodeQues;

import java.util.HashSet;

public class ContainsDuplicate {
	
	static boolean containsDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<arr.length;i++) {
			//if the num exists in the set then returns true
			if(set.contains(arr[i])) return true;
			//if not then add that num to the set
			set.add(arr[i]);
		}
		return false;
	}
//another method is to sort the array and check i and i+1 equals if does then there is duplicate
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		containsDuplicate(arr);
	}
}
