package com.company;

public class Chapter_2_09_operators {
    public static void main(String[] args) {

//        int a = 6*5/2;
//        int b = 5*60/2;
//        int sum = a + b;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(sum);
// Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        //  int k = x * y/2;

        int b = 0;
        int c = 0;
        int a = 10;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);
    }
}
