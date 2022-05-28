package Strings;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

        String input1 = "danger";
        String input2 = "garden";

        System.out.println(isAnagram(input1, input2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), i);

        }

        for (int i = 0; i < s1.length(); i++) {

            if (map.containsKey(s2.charAt(i))) {
                map.remove(s2.charAt(i));
            }

            if (map.size() == 0) {
                return true;
            }

        }

        return false;
    }

}