package LeetCodeQues;

import java.util.Arrays;

public class TwoSum2 {
	static int[] twosum2(int[] arr, int target) {
		int startPointer = 0;
		int endPointer = arr.length -1;
		
		while(startPointer < endPointer) {
			int sum = arr[startPointer] + arr[endPointer];
			if( sum== target) {
				return new int[] {startPointer,endPointer};
			}
			else if(sum > target) {
				endPointer--;
			}else {
				startPointer++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,7,15,23,35,79};
		int target = 37;
		System.out.println(Arrays.toString(TwoSum2.twosum2(arr, target)));
	}
}
