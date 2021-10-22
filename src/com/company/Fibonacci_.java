package com.company;

import java.util.Scanner;

public class Fibonacci_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1;
        System.out.println(0);
        System.out.println(1);
        for (int i=2;i<n;i++){
            System.out.println(n1+n2);
            int temp=n2;
            n2=n1+n2;
            n1=temp;

        }
    }
}
