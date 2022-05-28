package Arrays;

public class TargElementIndex {
    public static void main(String[] args) {
        int[] input = { 2, 4, 5, 5, 5, 5, 5, 5, 7, 9, 9 };
        int target = 5;
    }

    public static int[] findIndex(int[] input, int target) {

        int start = 0;
        int end = input.length - 1;

        int mid = (start + end) / 2;


        if(input[mid]==target) {
            
        }

        return new int[] { -1, -1 };
    }
}
