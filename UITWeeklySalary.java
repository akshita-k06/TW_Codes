package com.company;

import java.util.Scanner;

public class UITWeeklySalary {
    public static int computeWeeklySalary(int[] eachDayHour){
        int totalSalary=0,tempSalary,weekHourSum=0;
        for(int i=0;i<7;i++){
            //for sunday
            if(i==0 && eachDayHour[i]!=0){
                tempSalary=eachDayHour[i]*100;
                if(eachDayHour[i]>8){
                    tempSalary+=(eachDayHour[i]-8)*15;
                }
                totalSalary+=tempSalary+(tempSalary/2);
            }
            //for saturday
            if(i==6 && eachDayHour[i]!=0){
                tempSalary=eachDayHour[i]*100;
                if(eachDayHour[i]>8){
                    tempSalary+=(eachDayHour[i]-8)*15;
                }
                totalSalary+=tempSalary+(tempSalary/4);
            }
            //for remaining days
            if(eachDayHour[i]!=0 && i>=1 && i<=5){
                weekHourSum+=eachDayHour[i];
                totalSalary+=100*eachDayHour[i];
                if(eachDayHour[i]>8){
                    totalSalary+=(eachDayHour[i]-8)*15;
                }
            }
        }
        //weekly extra
        if(weekHourSum>40){
            totalSalary+=(weekHourSum-40)*25;
        }
        return totalSalary;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] eachDayHour=new int[7];
        for(int i=0;i<7;i++){
            eachDayHour[i]=sc.nextInt();
        }
        System.out.println(computeWeeklySalary(eachDayHour));
    }
}
