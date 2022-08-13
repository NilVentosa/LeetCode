package xyz.ventosa.leetcode.problems;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder();
        int shortest = strs[0].length();

        for (String word: strs) {
            if (word.length() < shortest) {
                shortest = word.length();
            }
        }

        int i = 0;
        while (i < shortest) {
            char currentChar = strs[0].charAt(i);
            for (String word: strs) {
                if (word.charAt(i) != currentChar) {
                    return result.toString();
                }
            }
            result.append(currentChar);
            i++;
        }

        return result.toString();
    }
}
