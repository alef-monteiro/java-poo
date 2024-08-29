package model;

import absModel.Form;

public class Square extends Form {
    private float size;

    public float getSquare() {
        return size;
    }

    public void setSquare(float size) {
        this.size = size;
    }

    public Square(float size) {
        this.size = size;
    }

    @Override
    public double calcArea() {
        return size*size;
    }

    @Override
    public double calcPerimeter() {
        return 4*size;
    }
}
