package com.company;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        al.ensureCapacity(100);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1,600);
        al.forEach(x-> System.out.println(x));
    }
}
