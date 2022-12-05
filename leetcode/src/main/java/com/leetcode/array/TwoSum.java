package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] twoSumResult = new TwoSum().twoSumHashMap(new int[]{3, 3}, 6);
        System.out.println(Arrays.toString(twoSumResult));
    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> valuesWithIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (!valuesWithIndexes.containsKey(difference)) {
                valuesWithIndexes.put(nums[i], i);
            } else {
                return new int[]{i, valuesWithIndexes.get(difference)};
            }
        }
        return new int[]{};
    }
}
