package model;


public class TiposVariavel {
    private byte a;
    private short b;
    private int c;
    private float d;

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }


    public void show() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }
}

