package xyz.ventosa.leetcode.problems;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int previous = -101;
        int currentIndex = 0;
        for (int num: nums) {
            if (num != previous) {
                nums[currentIndex] = num;
                currentIndex++;
            }
            previous = num;
        }
        System.out.println(Arrays.toString(nums));
        return currentIndex;
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,2,2,3,4,4,4,4});
    }
}
