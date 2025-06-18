package com.training.classes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class tstNumbers {

    public static void main(String args[]) {

        System.out.println(System.getProperty("user.dir"));
        try {
            FileInputStream fis = new FileInputStream("src\\com\\training\\classes\\text.txt");

            BufferedInputStream bis = new BufferedInputStream(fis);

            if(bis.read() > bis.read()) {
                System.out.println("First number is BIG");
            } else System.out.println("Second is big");

        }
        catch(IOException ie) {
            System.err.println("Error"+ie);
        } catch(Exception e) {
            System.out.println("Error...:"+e);
        }

    }
}
