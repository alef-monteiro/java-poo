package src.app;

import src.model.Quadrado;

import src.iModel.iFiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        iFiguraGeometrica quadradoInteface = new Quadrado();

        quad.setLado(4);

        System.out.println(quad.getLado());
    }
}
