package com.company;

import java.util.Scanner;

public class CollatzSequence {
    public static void getCollatzSequence(int n){
        int countOperations=0;
        while(n>1){
            System.out.print(n+ " ");
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            countOperations++;
        }
        System.out.print(1+" "+countOperations);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        getCollatzSequence(n);
    }
}
