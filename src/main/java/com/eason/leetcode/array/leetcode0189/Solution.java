package com.eason.leetcode.array.leetcode0189;

import java.net.Socket;
import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,(k % nums.length) - 1);
        reverse(nums,(k % nums.length),nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end){
        int temp;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.rotate(nums, 3);
    }
}
