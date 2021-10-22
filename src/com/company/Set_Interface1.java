package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface1 {
    public static void main(String[] args) {
        Set <Integer> s = new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(10);
        System.out.println(s);

    }
}
