package xyz.ventosa.leetcode.problems;

public class SearchAndInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (high + low) / 2;
        }
        return low;
    }

    public int searchInsertBruteForce(int[] nums, int target) {
        if (target > nums[nums.length-1]) return nums.length;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return 0;
    }

}