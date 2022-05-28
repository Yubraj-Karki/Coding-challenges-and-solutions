// package Recursion;

// public class BinarySearch {
// public static void main(String[] args) {
// int[] arr = { 1, 7, 12, 15, 55, 60 };
// }

// public static int binarySearch(int[] arr, int target, int first, int mid, int
// end) {
// int start = 0;
// int end = arr.length - 1;
// int mid = (start + end) / 2;

// if (target > arr[mid]) {
// start = mid + 1;
// }

// if (target < arr[mid]) {
// end = mid - 1;
// }

// if (target == arr[mid]) {
// return mid;
// }

// return binarySearch(arr, target, start, mid, end);

// }
// }
