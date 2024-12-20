package LeetCodeQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array
        
        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicates for the first number
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1, k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                
                if (sum == 0) {
                    // Add the triplet to the result
                    result.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    // Skip duplicates for the second number
                    while (j < k && arr[j] == arr[j + 1]) j++;
                    
                    // Skip duplicates for the third number
                    while (j < k && arr[k] == arr[k - 1]) k--;
                    
                    // Move both pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++; // Increase the sum
                } else {
                    k--; // Decrease the sum
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};
        List<List<Integer>> result = threeSum(arr);
        
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
