package LeetCodeQues;

//Using Kadanes algorithm
public class MaximumSubArr {
	static int maximumSubArr(int[] arr) {
		int max =Integer.MIN_VALUE;
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum > max) {
				max = sum;		
			}else if(sum <0) {
				sum = 0;
			}
		}
		return max;
	}
}
