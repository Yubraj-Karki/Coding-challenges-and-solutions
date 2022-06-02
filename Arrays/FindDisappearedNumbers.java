package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int array[] = { 6, 1, 2, 3, 4, 10, 5, 7 };

        findDisappearedNumbers(array);
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {

                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // Finding the missing element
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        System.out.println(Arrays.toString(ans.toArray()));

        return ans;

    }

    private static void swap(int[] arr, int i, int correctIndex) {

        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;

    }
}
