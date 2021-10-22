package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Interface {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        ListIterator<Integer>it=list.listIterator();
            while (it.hasNext()){
                it.add(500);
                it.next();
            }
        System.out.println(list);
    }
}
