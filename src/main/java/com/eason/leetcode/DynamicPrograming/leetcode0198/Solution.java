package com.eason.leetcode.DynamicPrograming.leetcode0198;

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return nums[0] > nums[1] ? nums[0]:nums[1];
        }
        //保存第i-2天能偷窃到的最大金额
        int pre = nums[0];
        //保存第i-1天能偷窃到的最大金额
        int current = nums[0] > nums[1] ? nums[0]:nums[1];
        //保存到第i号能偷窃到的最大金额
        int sum = 0;
        for(int i=2;i<nums.length;i++){
            sum = Math.max(nums[i] + pre,current);
            pre = current;
            current = sum;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] nums = {2,1,1,2};
        Solution solution = new Solution();
        System.out.println(solution.rob(nums));
    }
}