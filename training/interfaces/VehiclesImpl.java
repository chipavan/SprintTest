package com.training.interfaces;

public class VehiclesImpl implements Vehicle, train {

    public static void main(String args[]){

        car cr = new car();
        int carBS = cr.bootSpace(12);
        int cc = cr.engineCC(1200);
        int tyres = cr.noOfTyres(4);

        System.out.println("Car is having "+tyres+"tyres with "+cc+" of CC and "+carBS+"liters of boot space"+" year of making:"+cr.yOM(2024));

        Lorry lr = new Lorry();
        int lrBS = lr.capacity(100);
        int lorryCC = lr.engineCC(1200);
        int Ltyres = lr.noOfTyres(4);

        System.out.println("Lorry is having "+Ltyres+"tyres with "+lorryCC+" of CC and "+lrBS+"liters of boot space");
    }

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
        return 0;
    }

    @Override
    public String track() {
        return "";
    }
}
