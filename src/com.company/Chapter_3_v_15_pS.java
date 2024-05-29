package com.company;

public class Chapter_3_v_15_pS {
    public static void main(String[] args) {

        // Question 1
        String name = "Niraj";
        System.out.println(name);

        // Question 2

//       String text = "To My     Friend";
//        text = text.replace(" ", "_");
//        System.out.println(text);
        // Question 3

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Niraj");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);


    }
}
