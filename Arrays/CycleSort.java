package Arrays;

import java.util.Arrays;

class CycleSort {
    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != correctIndex) {
                swap(arr, i, correctIndex);
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