package com.ustc.utils;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/5/30 10:27
 */

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}
    public ListNode(int val){this.val = val;}
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
