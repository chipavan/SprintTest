package com.training.classes;

public class first {

    // Method over loading.
    public static void main(String args[]) {
        first fir = new first();
        fir.calType();
        fir.first();
    }

    public int first() {
        int firstNum = 124;
        return firstNum;
    }
    public String calType() {
        String calType = "addition";
        return calType;
    }
}
