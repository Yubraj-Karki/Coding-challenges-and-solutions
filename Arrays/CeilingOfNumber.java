package Arrays;

import java.util.Arrays;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 16;

        System.out.println(findCeiling(nums, target));
    }

    public static int findCeiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return start;

    }
}
