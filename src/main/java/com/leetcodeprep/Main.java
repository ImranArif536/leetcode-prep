package com.leetcodeprep;

import com.leetcodeprep.linkedList.LinkedListCustom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedListCustom<Integer> ll = new LinkedListCustom();
        ll.add(1);
        ll.add(2);
        System.out.println(ll.get(1).value);
    }
}