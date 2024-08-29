package model;

import absModel.Form;

public class Rectangle extends Form {
    private float height;
    private float width;

    public Rectangle(float h, float w) {
        this.height = h;
        this.width = w;
    }

    public Rectangle() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public double calcPerimeter() {
        return 2*width+2*height;
    }
}
