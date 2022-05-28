package Arrays;

import java.util.Arrays;
import java.util.HashMap;

// import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 7, 15 };
        int target = 16;

        int[] result = twoSum(nums, target);

        // System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(result));

    }

    // Naive approach (O(n)^2)
    // public static int[] twoSum(int[] nums, int target) {
    // int[] ans = new int[2];
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // ans[0] = i + 1;
    // ans[1] = j + 1;
    // }
    // }
    // }

    // return ans;
    // }

    // optimized approach (using Hashmap), Time complexity of this solution: O(n).
    public static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
        }

        return new int[] { -1, -1 };
    }

}
