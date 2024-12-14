package LeetCodeQues;

public class MajorityElement {

	//There is this condition to find the majority element by time complexity O(n) and space O(1)
	
	static int majorityElement(int[] arr) {
		int count=0;
		int res=0;
		for(int n : arr) {
			if(count == 0) {
				res = n;
			}
			//or else
			// count += res==n?1:-1;
			if(res == n) {
				count++;
			}else {
				count--;
			}
		}
		return res;
		
	}
}
