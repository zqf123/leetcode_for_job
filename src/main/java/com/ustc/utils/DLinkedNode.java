package com.ustc.utils;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/13 10:52
 */

public class DLinkedNode {
    public int key;
    public int value;
    public DLinkedNode prev;
    public DLinkedNode next;
    public DLinkedNode(){}
    public DLinkedNode(int _key, int _value){
        key = _key;
        value = _value;
    }
}
