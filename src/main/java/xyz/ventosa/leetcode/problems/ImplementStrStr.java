package xyz.ventosa.leetcode.problems;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() ==  0) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(new ImplementStrStr().strStr("hello", "ll"));
    }



}
