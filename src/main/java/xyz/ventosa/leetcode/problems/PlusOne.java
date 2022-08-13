package xyz.ventosa.leetcode.problems;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] != 9) {
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        }

        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    System.arraycopy(digits, 0, result, 1, result.length - 1);
                    return result;
                }
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        return digits;
    }
}
