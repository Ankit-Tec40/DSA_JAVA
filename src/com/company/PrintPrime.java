package com.company;

import java.util.Scanner;

public class PrintPrime {
    static Boolean isPrime(int num){
        int temp=0;
        for(int j=2;j*j<=num;j++){
            if(num%j==0){
                temp=1;
                break;
            }
        }
        if(temp==1){
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for (int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
}
