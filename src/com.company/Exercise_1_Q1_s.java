package com.company;
import java.util.Scanner;
public class Exercise_1_Q1_s {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables to store marks of 5 subjects
        double sub1, sub2, sub3, sub4, sub5;

        // Prompt the user to enter marks for each subject
        System.out.println("Enter the marks for Subject 1 (out of 100): ");
        sub1 = scanner.nextDouble();

        System.out.println("Enter the marks for Subject 2 (out of 100): ");
        sub2 = scanner.nextDouble();

        System.out.println("Enter the marks for Subject 3 (out of 100): ");
        sub3 = scanner.nextDouble();

        System.out.println("Enter the marks for Subject 4 (out of 100): ");
        sub4 = scanner.nextDouble();

        System.out.println("Enter the marks for Subject 5 (out of 100): ");
        sub5 = scanner.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (totalMarks / 500) * 100;


        // Display the result
       System.out.println("Total Marks: " + totalMarks + " out of 500");
       System.out.println("Percentage: " + percentage + "%");


        // Close the scanner
        scanner.close();


    }
}
