package com.company;

import java.util.Scanner;

public class LowerTriangularMatrix {
    public static boolean checkLowerTriangularMatrix(int[][] matrix,int rows,int columns){
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                if(j>i && matrix[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] matrix=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        if(checkLowerTriangularMatrix(matrix,rows,columns)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
