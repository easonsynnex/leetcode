package com.eason.leetcode.leetcode0169;

public class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                System.out.println(i);
                result = nums[i];
                count = 1;
            }else if(nums[i] != result){
                System.out.println("!="+i);
                count--;
            }else{
                System.out.println("=="+i);
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums));
    }
}
