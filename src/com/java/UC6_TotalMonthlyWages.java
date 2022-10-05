package com.java;

//Calculate Wages till a condition of total working hours or days is reached for a month
// Assume 100 hours and 20 days

public class UC6_TotalMonthlyWages {
    public static void main(String[] args) {
        int workingDays_PerMonth = 20;
        int total_MonthlyHours = 0;
        int wagePerHour = 20;     // obtained from uc2
        int totalWorking_days = 0;
        int emp_hours;
        do {
            double check = Math.floor(Math.random() * 10) % 2;
            switch ((int) check) {
                case 1:
                    emp_hours = 100;
                    break;
                case 0:
                    emp_hours = 80;  //obtained from uc 3 part time hour =8....8*10=80
                    break;                      //assumed monthly partime days =10
                default:
                    emp_hours = 0;
            }
                    total_MonthlyHours = total_MonthlyHours + emp_hours;

            int monthlyWage=total_MonthlyHours*20;
            System.out.println("monthlyWage = "+monthlyWage);

        }
            while ((total_MonthlyHours < 100) && (totalWorking_days <= 20)) ;


        }
    }



