package com.java;

//Calculating Wages for a Month Assume 20 Working Day per Month

public class UC5_MonthlyWages {
    public static void main(String[] args){
        int wage_per_hour=20;
        int total_hours=8;
        int working_Day_perMonth=20;
        int dailyWage=wage_per_hour*total_hours;
        System.out.println("Daily employee wage :  "+dailyWage);
        System.out.println("Monthly employee wage :  "+(dailyWage*working_Day_perMonth));



    }
}
