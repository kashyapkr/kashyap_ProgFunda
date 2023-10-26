package com.gradeproject.q2;
import java.util.Scanner;

public class Power {
    public static int PowerRec(int x,int n){
        if(n==0){
            return 1;
        }
        return x*PowerRec(x,n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number X:");
        int x = sc.nextInt();
        System.out.println("Enter the power N :");
        int n = sc.nextInt();
        System.out.println("X power N is: "+ PowerRec(x,n) );


    }
}
