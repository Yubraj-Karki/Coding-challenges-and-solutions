package Arrays;

import java.util.Arrays;

class CycleSort {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 2, 1 };

        cycleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void cycleSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            // If current element is not at its correct index,
            // we wanna swap it to its correct index
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

    }

    // Method that swaps elements in their correct position
    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}