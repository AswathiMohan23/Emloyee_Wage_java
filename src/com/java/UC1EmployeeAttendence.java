package com.java;

public class UC1EmployeeAttendence {
    public static void main(String[] args) {
        int fullTime=1;
        double check = Math.floor(Math.random()*10)%2;
        if(check==fullTime)
            System.out.println("employee present");
        else
            System.out.println("employee absent");
    }
}
