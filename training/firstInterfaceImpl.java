package com.training;

public class firstInterfaceImpl implements firstInerface {

    public static void main(String args[]) {

        firstInterfaceImpl fII = new firstInterfaceImpl();

        String ab = fII.abc(12, 15);
        String ccc = fII.bbc("Hello");
        System.out.println("Val..:"+ab+":   "+ccc);

    }
    @Override
    public String abc(int a, int b) {
        return "from abc";
    }

    @Override
    public String bbc(String ab) {
        return "from bbc";
    }
}
