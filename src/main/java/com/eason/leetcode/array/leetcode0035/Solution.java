package com.eason.leetcode.array.leetcode0035;


public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        return doSearch(nums, 0, nums.length - 1, target);
    }

    public int doSearch(int[] nums, int begin, int end, int target){
        if(begin > nums.length) {
            return nums.length;
        }else if(end < 0){
            return 0;
        }else if(begin > end){
            return begin;
        }
        int mid = (begin + end) / 2;
        if(target > nums[mid]){
            return doSearch(nums, mid + 1, end, target);
        }else if(target < nums[mid]){
            return doSearch(nums, begin, mid - 1, target);
        }else{
            return mid;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, 2));
    }
}
