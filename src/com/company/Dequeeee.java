package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeeee {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        dq.pollFirst();
        System.out.println(dq);

    }
}
