package com.company;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Chapter_4_V_18_elseIfClause {
    public static void main(String[] args) {

        String var = "Saurabh";


        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");

        

    /*    int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become Adult!");
                break;
            case 21:
                System.out.println("You Are going to job");
                break;
            case 60:
                System.out.println("You Are going to Retired");
                break;
            default:
                System.out.println("Enjoy your life");


        }  */

        /*
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        */
    }
}
