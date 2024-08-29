package src.model;

import src.iModel.iFiguraGeometrica;

public class Quadrado implements iFiguraGeometrica {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        return lado * lado;
    }

    @Override
    public int getPerimetro() {
        return 4 * lado;
    }
}
