package xyz.ventosa.leetcode.problems;

public class PalindromNumber {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        int original = x;
        int reversed = 0;
        int pop;

        while (x > 0) {
            pop = x % 10;
            x /= 10;

            reversed = (reversed * 10) + pop;
        }

        return reversed == original;

    }
}
