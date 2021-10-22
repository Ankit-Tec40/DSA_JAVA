package com.company;

import java.util.ArrayDeque;

public class Stacks {
    public static void main(String[] args) {
        ArrayDeque<Integer> st=new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
    }
}
