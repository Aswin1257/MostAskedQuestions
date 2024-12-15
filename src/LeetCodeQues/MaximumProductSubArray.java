package LeetCodeQues;

public class MaximumProductSubArray {
	
	//Intiutive way of solving the problem
	static int maximumProductSubArray(int[] arr) {
		int max= Integer.MIN_VALUE;
		int prefix = 1;
		int sufix = 1;
		for(int i = 0;i<arr.length;i++) {
	
			prefix*=arr[i];
			sufix*=arr[arr.length-1-i];
			if(prefix == 0) {
				prefix = 1;
			}else if(sufix == 0) {
				sufix =1;
			}
			 max = Math.max(max, Math.max(prefix, sufix));
			 //the elaborate way of doing the above line is shown below
//			if(prefix > max) {
//				max = prefix;
//			}else if(sufix > max) {
//				max = sufix;
//			}
		}
		return max;
	}
	
	//Easy method by Gemini
	static int maximumProductSubArrayEasy(int[] arr) {
		int max = 1;
		int min = 1;
		//result can't be given has 1 because incase of  all negative number array there won't be any 1
		//so taking the first element is much more good practice
		//At the end there might be an possibility that the max itself becomes negative number so 
		//keeping track in result variable
		int result = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			int temp_max = Math.max(arr[i], Math.max(arr[i]*max, arr[i]*min));
			//There might be some possibilities that the multiplying an negative number with another negative number
			//leads to an larger positive number so keeping track of min number is important especially in negative number included arr
			min = Math.min(arr[i], Math.min(arr[i]*max, arr[i]*min));
			max = temp_max;
			
			result = Math.max(result, max);
		}
		return result;
	}
}
