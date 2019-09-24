package com.eason.leetcode.Stack.leetcode0020;

import java.util.ArrayDeque;

class Solution {

    public static void main(String[] args) {
        String a = "]";
        Solution solution = new Solution();
        solution.isValid(a);
    }
    public boolean isValid(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        char c;
        for(int i=0;i<s.length();i++){
            switch(c=s.charAt(i)){
                case '(':
                case '{':
                case '[':
                    queue.add(c);break;
                case ')':
                    if(queue.isEmpty() || queue.pollLast()!='('){
                        return false;
                    }
                    break;
                case ']':
                    if(queue.isEmpty() || queue.pollLast()!='['){
                        return false;
                    }
                    break;
                case '}':
                    if(queue.isEmpty() || queue.pollLast()!='{'){
                        return false;
                    }
                    break;
                default:return false;
            }
        }
        return queue.isEmpty();
    }
}