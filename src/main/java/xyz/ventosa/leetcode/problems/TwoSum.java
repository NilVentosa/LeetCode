package xyz.ventosa.leetcode.problems;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> thing = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (thing.containsKey(target-nums[i])) {
                return new int[]{i,thing.get(target-nums[i])};
            }
            thing.put(nums[i], i);
        }

        return new int[2];
    }
}
