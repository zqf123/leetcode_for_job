package com.ustc.order.three;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 21:58
 */
//21.合并两个有序链表
public class MergeTwoLists {
    public static void main(String[] args) {

    }
    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (list1 != null && list2!= null){
            if (list1.val < list2.val){
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            }else{
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        if (list1 != null){
            curr.next = list1;
        }
        if (list2 != null){
            curr.next = list2;
        }
        return dummy.next;
    }
}
