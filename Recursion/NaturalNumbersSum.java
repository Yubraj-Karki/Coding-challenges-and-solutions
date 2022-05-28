package Recursion;

public class NaturalNumbersSum {
    public static void main(String[] args) {

        System.out.println(sum(10));
    }

    public static int sum(int value) {

        // base condition
        if (value <= 1)
            return value;

        return value + sum(value - 1);

    }

    // public static int sum(int value) {
    // int ans = 0;

    // for (int i = 0; i <= value; i++) {

    // ans += i;

    // }

    // return ans;

    // }
}
