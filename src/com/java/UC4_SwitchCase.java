package com.java;

public class UC4_SwitchCase {
    public static void main(String[] args){
        int check = (int) (Math.floor(Math.random()*10)%2);
        switch(check){
            case 0 :
                System.out.println("employee absent");
                break;
            case 1 :
                System.out.println("employee present ");
                break;
            default:
                System.out.println("number is "+check);

        }

        }
}
