package model;

import absModel.Transport;

public class Bike extends Transport {
    private int gearing;

    public int getGearing() {
        return gearing;
    }

    public void setGearing(int gearing) {
        this.gearing = gearing;
    }

    @Override
    public void acelerar() {
    }

    @Override
    public void freiar() {
    }
}
