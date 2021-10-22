package com.company;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int num=sc.nextInt();
            int temp=1;
            for(int j=2;j*j<num;j++){
                if(num%j==0){
                    temp=0;
                    break;
                }
            }
            if(temp==0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
        }

    }

}

