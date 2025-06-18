package com.training;

public class variablesTest {

    public static void main(String args[]) {

        // Interger variables
        //int a =23, b = 20, c = a+b;
        int a =23;
        int b = 56;
        int c = a*b;
        //int c;
        c = a+b;        //  Addition
        c=  a-b;    // Subtraction
        c=a*b;
        c=a/b;
        c=a%b;
        //System.out.println("Value... of A:" +a+" : B value:"+b+":  Result is:"+c);
        System.out.println("Result...:"+c);

        // Long
        long abc = 585987968, pqr=67868768, rs;
        rs=abc*pqr;
        System.out.println("Result of ABC*PR:"+rs);

        // float
        float ab = 63457, bc= 45;
        float bb = ab/bc;
        System.out.println("Res..."+bb);

        //double
        double ww = 458878.6969869, hh = 6786868689.6896899;
        double hu = ww*hh;
        System.out.println("Double res..:"+hu);


        // Char data type
        char char1 = 'c';
        //System.out.println("Char...:"+char1);

        // String data type.    StringBuffer, StringBuilder
        String txt = "Hello world...";
        //txt = "This is system...";
        txt = txt + "This is system";

        System.out.println("Result...:"+txt);

        boolean aaa = false;
        System.out.println("Val  "+aaa);
    }
}
