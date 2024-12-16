package LeetCodeQues;

public class MergeSortedArr {

	public static int[] mergeSortedArr(int[] arr, int[] arr2) {
		int[] sorted = new int[arr.length+arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<arr.length&& j < arr2.length) {
			if(arr[i] < arr[j]) {
				sorted[k++] = arr[i++];
			}else {
				sorted[k++] = arr[j++];
			}
		}
		
		while(i<arr.length) {
			sorted[k++] = arr[i++];
		}
		while(j<arr.length) {
			sorted[k++] = arr[j++];
		}
		return sorted;
	}
}
