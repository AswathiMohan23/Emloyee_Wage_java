package com.java;

public class UC1_EmployeeAttendence {
    public static void main(String[] args) {
        int full_time=1;
        double check = Math.floor(Math.random()*10)%2;
        if(check==full_time)
            System.out.println("employee present");
        else
            System.out.println("employee absent");
    }
}
