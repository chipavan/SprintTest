package com.training.classes;

public class third extends second implements fourth {

    // Java doesn't support Multiple inheritance. That is why we use interfaces to achieve this.
    public static void main(String args[]) {
        third th = new third();
        //System.out.println("First..."+th.second()+": calculation :"+th.calType()+":  other val :"+th.second(45));

        showText(35, 26);

    }

    public int second() {       // Method overriding
        return 200;
    }

    public int second(int one) { // Method overloading
        return 250;
    }

    @Override
    public String txt() {
        return "";
    }

    public static void showText(int one, int two) {
        System.out.println("Addition:"+(one+two)+":  Subtraction:"+(one-two));
        System.out.println("In Show Method...");
    }
}
