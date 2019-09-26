package com.eason.leetcode.Stack.leetcode0225;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyStack {
    List<Integer> data;
    /** Initialize your data structure here. */
    public MyStack() {
        this.data = new ArrayList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        data.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(data.size() == 0){
            throw new RuntimeException("The stack is empty.");
        }
        return data.remove(data.size() - 1);
    }

    /** Get the top element. */
    public int top() {
        if(data.size() == 0){
            throw new RuntimeException("The stack is empty.");
        }
        return data.get(data.size() - 1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return data.size() == 0;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }

    class MyQueue {
        LinkedList<Integer> data;
        /** Initialize your data structure here. */
        public MyQueue() {
            this.data = new LinkedList<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            data.add(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(data.size() == 0){
                throw new RuntimeException("The stack is empty.");
            }
            return data.remove();
        }

        /** Get the front element. */
        public int peek() {
            if(data.size() == 0){
                throw new RuntimeException("The stack is empty.");
            }
            return data.get(0);
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return data.size() == 0;
        }
    }
}