package com.training;

public class conditionalStatements {

    public static void main(String args[]) {

        int a = 20, b = 45, c = 30;
        if ((a > b) && (a > c)) {
            System.out.println("A is big");
        } else if ((b>a)&&(b>c)) {
            System.out.println("B is big");
        }
        else {
            System.out.println("C is big");
        }

        /*int ab = 15, db = 25;
        while(ab < db) {
            System.out.println("db is big...");
        }*/

        // Loops : for, while, do...while
        // Declaration of starting point       numbers 1 to 10.
        // Increment / decrement
        // Condition            less than or equal to 10

        // for loop
        /*for(int i = 1; i <= 100; i++) {
            System.out.println("Value...:"+i);
        } */


        // while loop
        int i = 45;
        while(i<=1) {
            System.out.println("Value.:"+i);
            i++;   // i++;
        }

        // do...while
       /* int j = 25;
        do {
            System.out.println("Val..."+j);
            j++;
        } while(j<=10); */
    }
}
