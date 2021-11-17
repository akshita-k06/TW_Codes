package com.company;

import java.util.Scanner;

public class ArrayType {
    public static int checkArrayType(int[] array,int size){
        int evenCount=0,oddCount=0;
        for(int i=0;i<size;i++){
            if(array[i]%2==0){
                evenCount++;
            }
            if(array[i]%2!=0){
                oddCount++;
            }
        }
        if(oddCount==0){
            return 1;
        }
        else if(evenCount==0){
            return 2;
        }
        return 3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int outputValue=checkArrayType(array,size);
        if (outputValue==1){
            System.out.println("Even");
        }
        else if(outputValue==2){
            System.out.println("Odd");
        }
        else{
            System.out.println("Mixed");
        }
    }
}
