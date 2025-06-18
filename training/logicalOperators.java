package com.training;

public class logicalOperators {

    public static void main(String args[]) {

        int a = 7, b = 10;
        String ab  = "Hello", bb = "hELLO";
        /*
        if(a > b) {
            System.out.println("A is big");
        } else
            System.out.println("B is big");

        if(a == b) {            // Checking whether both are same
            System.out.println("A and B are same");
        } else System.out.println("A B are not same");

        for(int i = 0; i <= 10; i++) {
            System.out.println("value  :"+i);
        } */

        if(ab.equalsIgnoreCase(bb)) {
            System.out.println("Both are same strings...");
        } else System.out.println("Both are NOT same");
    }
}
