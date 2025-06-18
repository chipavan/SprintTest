package com.training.interfaces;

public class Lorry implements Vehicle {

    @Override
    public int noOfTyres(int tyres) {
        return 8;
    }

    @Override
    public int engineCC(int cc) {
        return 3000;
    }

    @Override
    public int yOM(int yom) {
        return yom;
    }

    public int capacity(int capacity) {
        return 100;
    }
}
