package com.company;

import java.util.Scanner;

public class PowerLogarithmic {
    public static int pl(int x,int n){
        if(n==0){
            return 1;
        }
        return(x*pl(x,n-1));
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pl(x,n));
    }
}
