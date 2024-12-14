package LeetCodeQues;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] arr,int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return new int[] {i};
			}
			
			//Another method
//			Integer existsInteger= map.get(arr[i]);
//			if(existsInteger!=null) {
//				return new int[] {i,existsInteger};
//			}
//			map.put(target-arr[i], i);
			
			
			if(map.isEmpty()) {
				map.put(target-arr[i], i);
			}
			else if(map.containsKey(arr[i])){
				return new int[] { map.get(arr[i]),i};
			}else {
				map.put(target-arr[i], i);
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,6,4,12,100,25};
		int target = 30;
		TwoSum aSum = new TwoSum();
		System.out.println(Arrays.toString(aSum.twoSum(arr, target)));
	}
}
