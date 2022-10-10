package com.java;

//Calculating Wages for a Month Assume 20 Working Day per Month

public class UC5MonthlyWages {
    public static void main(String[] args){
        int wagePerHour=20;
        int totalHours=8;
        int workingDayPerMonth=20;
        int dailyWage=wagePerHour*totalHours;
        System.out.println("Daily employee wage :  "+dailyWage);
        System.out.println("Monthly employee wage :  "+(dailyWage*workingDayPerMonth));



    }
}
