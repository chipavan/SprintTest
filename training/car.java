package com.training;

import com.training.interfaces.Vehicle;

public class car implements Vehicle {
    @Override
    public int noOfTyres(int tyres) {
        return 0;
    }

    @Override
    public int engineCC(int cc) {
        return 0;
    }

    @Override
    public int yOM(int yom) {
        return yom;
    }
}
