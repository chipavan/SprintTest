package com.training;

public class breakNgoto
{
    public static void main(String args[]) {

        String ab = "Goto and break";
        int cnt = 0;

        outer:
        for(int i=1; i <=5; i++) {
            for(int j = 0; j <=10; j++) {

                if (j == 5) {
                    //cnt++;
                    System.out.println("At value 5" + ": cnt " + cnt);
                    continue outer;
                }
            }
        }
        System.out.println("End");
    }
}
