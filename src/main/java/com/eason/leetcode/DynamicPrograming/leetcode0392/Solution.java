package com.eason.leetcode.DynamicPrograming.leetcode0392;

class Solution {
    /**
     * 贪心算法:最优解，只循环子序列次，时间复杂度O(n),空间复杂度O(1)
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        if("".equals(s)){
            return true;
        }
        char[] c = s.toCharArray();
        int index = -1;
        for(int i=0;i<c.length;i++){
            index = t.indexOf(c[i], index + 1);
            if(index == -1)
                return false;
        }
        return true;
    }
}