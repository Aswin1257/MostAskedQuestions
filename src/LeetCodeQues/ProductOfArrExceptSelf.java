package LeetCodeQues;

import java.util.Arrays;

public class ProductOfArrExceptSelf {
	static int[] productOfArrExceptSelf(int[] arr){
		int prefix =1;
		int postfix = 1;
		int[] result= new int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			result[i] = prefix;
			prefix *= arr[i];
		}
		for(int j = arr.length-1;j>=0;j--) {
			result[j] *= postfix;
			postfix *= arr[j];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] result = productOfArrExceptSelf(arr);
		System.out.println(Arrays.toString(result));
	}
}
