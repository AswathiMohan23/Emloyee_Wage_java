package com.java;

//Calculate Wages till a condition of total working hours or days is reached for a month
// Assume 100 hours and 20 days

public class UC6TotalMonthlyWages {
    public static void main(String[] args) {
        int totalMonthlyHours = 0;
        int totalWorkingDays = 0;
        int empHours;
        do {
            double check = Math.floor(Math.random() * 10) % 2;
            switch ((int) check) {
                case 1:
                    empHours = 100;
                    break;
                case 0:
                    empHours = 80;  //obtained from uc 3 part time hour =8....8*10=80
                    break;                      //assumed monthly partime days =10
                default:
                    empHours = 0;
            }
            totalMonthlyHours = totalMonthlyHours + empHours;
            int monthlyWage=totalMonthlyHours*20;
            System.out.println("monthlyWage = "+monthlyWage);
        }
            while ((totalMonthlyHours < 100) && (totalWorkingDays <= 20)) ;
        }
    }



