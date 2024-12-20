package LeetCodeQues;

public class FindMinRotatedSortedArr {
	static int findMin(int[] arr) {
		int start = 0;
		int end = arr.length-1;

		while(start<end) {
			int mid = start+(end-start)/2;
			if(mid<arr.length-1&& arr[mid] > arr[mid+1]) {
				return arr[mid+1];
			}
			if(mid>0&& arr[mid]<arr[mid-1]) {
				return arr[mid];
			}
			if(arr[start]<arr[mid]) {
				start = mid+1;
			}
			else if(arr[start] > arr[mid]) {
				end = mid-1;
			}
		}
		return arr[start];
		 
	}
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,2,3};
		int result = findMin(arr);
		System.out.println(result);
	}
}
