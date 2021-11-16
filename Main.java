package com.company;
import java.util.*;
public class Main {
    public static int checkPresenceOfTree(int rows,int column,int treeNum){
        int present=0;
        if(treeNum>=1 && treeNum<=column){
            present=1;
        }
        if(treeNum==column*rows){
            present=1;
        }
        else{
            int i=column;
            while(i<rows*column){
                if(i==treeNum || i+1==treeNum){
                    present=1;
                }
                i=i+column;
            }
        }

        return present;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns= sc.nextInt();
        int treeNum=sc.nextInt();
        int checkPresence=checkPresenceOfTree(rows,columns,treeNum);
        if(checkPresence==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
