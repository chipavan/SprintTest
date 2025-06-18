package com.training;

import com.training.interfaces.Vehicle;

public class bycicle implements Vehicle {
    @Override
    public int noOfTyres(int tyres) {
        return tyres;
    }

    @Override
    public int engineCC(int cc) {
        return cc;
    }

    @Override
    public int yOM(int yom) {
        return yom;
    }
}
