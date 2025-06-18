package com.training.classes;

public class second {

    // Method over loading.
    public static void main(String args[]) {

        second sec = new second();
        sec.calType();
        sec.second();
    }
    public int second() {
        int secondNum = 1240;
        return secondNum;
    }
    public String calType() {
        String calType = "multiply";
        return calType;
    }
}
