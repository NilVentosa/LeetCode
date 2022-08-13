package xyz.ventosa.leetcode.problems;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] split = s.replace("\n", " ").split(" ");
        return split[split.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("hello there    \n  "));

    }
}
