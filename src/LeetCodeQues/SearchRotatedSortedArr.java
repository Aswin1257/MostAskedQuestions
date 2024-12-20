package LeetCodeQues;



public class SearchRotatedSortedArr {
	static int searchRotatedSort(int[] arr,int target) {
		//find the peak index then do binary search on both the sides
		int peak = findPeakIndex(arr);
		int right = binarySearch(arr,0,peak,target);
		if(right != 0) {
			return right;
		}
		return binarySearch(arr,peak+1,arr.length,target);
		
	}
	
	private static int binarySearch(int[] arr, int start, int end, int target) {
		while(start<end) {
			int mid = start+(end-start)/2;
			if(arr[mid] ==target) {
				return mid;
			}
			if(arr[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return start;
	}

	static int findPeakIndex(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int middle = start+(end-start)/2;
			if(arr[middle]>arr[middle+1]) {
				return middle;
			}
			if(arr[middle]<arr[middle-1]) {
				return middle-1;
			}
			if(arr[start]>arr[middle]) {
				end = middle-1;
			}
			else if(arr[start]<arr[middle]) {
				start = middle+1;
			}
			
		}
		return start;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,1,2,3};
		int target = 1;
		int result = searchRotatedSort(arr, target);
		System.out.println(result);
	}
}
