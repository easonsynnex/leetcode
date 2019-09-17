package com.eason.leetcode.array.leetcode0581;


public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min =0;
        int max = 0;
        int begin =0;
        int end = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                min = nums[i - 1];
                break;
            }
        }
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i] < nums[i-1]){
                max = nums[i];
                break;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] > min){
                begin = i - 1;
                break;
            }
        }
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i] < max){
                end = i + 1;
                break;
            }
        }
        return end - begin;
    }

    public static void main(String[] args) {
        int nums[] = {2, 6, 4, 8, 10, 9, 15};
        Solution solution = new Solution();
        System.out.println(solution.findUnsortedSubarray(nums));
    }
}
