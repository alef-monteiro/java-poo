package model;

public class PrimitiveTypes {
    private byte a;
    private short b;
    private int c;
    private long d;
    private float e;
    private double f;
    private char g;
    private boolean h;

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public boolean isH() {
        return h;
    }

    public void setH(boolean h) {
        this.h = h;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public float getE() {
        return e;
    }

    public void setE(float e) {
        this.e = e;
    }

    public char getG() {
        return g;
    }

    public void setG(char g) {
        this.g = g;
    }

    public void show() {
        System.out.println("Type byte | value: " + a);
        System.out.println("Type short | value: " + b);
        System.out.println("Type int | value: " + c);
        System.out.println("Type long | value: " + d);
        System.out.println("Type float | value: " + e);
        System.out.println("Type double | value: " + f);
        System.out.println("Type char | value: " + g);
        System.out.println("Type boolean | value: " + h);

    }
}
