package xyz.ventosa.leetcode.problems;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int latestIndex = 0;
        for (int num: nums) {
            if (num != val) {
                nums[latestIndex] = num;
                latestIndex++;
            }
        }
        return latestIndex;
    }
}
