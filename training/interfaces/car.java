package com.training.interfaces;

public class car implements Vehicle, train {


    @Override
    public int noOfTyres(int tyres) {
        int model=2024;
        int weight = 2000;
        String area = "abc";
        if(area.equalsIgnoreCase("abc")&& weight > 1500) {
            return 6;
        }
        else if(area.equalsIgnoreCase("bbr")&& weight > 1500) {
            return 4;
        }
        else return 3;
    }

    @Override
    public int engineCC(int cc) {

        return cc;
    }

    @Override
    public int yOM(int yom) {
        return yom;
    }

    public int bootSpace(int bspace) {
        return bspace;
    }

    @Override
    public String track() {
        return "dsfhkos";
    }
}
