package Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int array[] = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };

        System.out.println(findNumber(array));

        System.out.println(Arrays.toString(array));
    }

    public static int findNumber(int[] arr) {
        int ans = -1;
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {

                i++;
            }
        }

        // Finding the missing element
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return ans = j + 1;
            }
        }

        return arr.length;
    }

    private static void swap(int[] arr, int i, int correctIndex) {

        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;

    }

}
