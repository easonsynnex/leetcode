package com.eason.leetcode.leetcode0001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: eason
 * @Description: 0001题：两数之和
 * @Date: 20:09 2019/8/27
 */
public class Code {
    private int[] twoNumbersSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++) {
            int result = target - nums[i];
            if(map.containsKey(result)){
                return new int[]{map.get(result), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Code code = new Code();
        int[] result = code.twoNumbersSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
