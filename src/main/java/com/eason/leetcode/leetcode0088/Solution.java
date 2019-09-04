package com.eason.leetcode.leetcode0088;

import java.util.Arrays;

/**
 * @author yinsheng
 * @date 2019/9/4 0004
 * @desc m > n
 */
public class Solution {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        int pn = n - 1;
        int pm = m > 0 ? m - 1 : 0;
        while(pn >= 0 && pm >= 0){
            if(nums2[pn] >= nums1[pm]){
                nums1[p] = nums2[pn];
                pn --;
            }else{
                nums1[p] = nums1[pm];
                if(pm == 0){
                    System.arraycopy(nums2, 0, nums1, 0, pn + 1);
                }
                pm --;
            }
            p--;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        Solution solution = new Solution();
        //solution.merge1(nums1, 3, nums2, 3);
        solution.merge2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
