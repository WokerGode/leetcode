package com.ygc.java;

import java.util.HashMap;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 14:19 2020/8/29
 * @Modified By:给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
 */
public class LeetCode_1 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target =0;
        LeetCode_1 leetCode_1 = new LeetCode_1();
        int[] ints = leetCode_1.twoSum(nums, target);
    }

    /**
     * 先存后查(两边hash表)
     */

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int j = target - map.get(nums[i]);
            if (map.containsKey(j) && map.get(j) != i) {
                return new int[]{i,map.get(j)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j)){
                return new int[] {i,map.get(j)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }


}
