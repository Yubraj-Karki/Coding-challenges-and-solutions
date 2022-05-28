package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String input = "racecar";
        // System.out.println(input.charAt(input.length() - 1));
        System.out.println(input.length());

        String x = input.substring(1, input.length() - 1);

        System.out.println(x);

    }

    public static boolean isPalindrome(String input) {

        // Defining the base-case/stopping condition
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        // Do some work to shrink the problem space
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        return false;
    }

}
