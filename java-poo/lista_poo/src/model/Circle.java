package model;

import absModel.Form;

public class Circle extends Form {
    private float ray;

    public float getRay() {
        return ray;
    }

    public void setRay(float ray) {
        this.ray = ray;
    }

    public Circle(float ray) {
        this.ray = ray;
    }

    @Override
    public double calcArea() {
        return 3.14*ray*ray;
    }

    @Override
    public double calcPerimeter() {
        return 3.14*ray*2;
    }
}