package model;

import absModel.Transport;

public class Automobile extends Transport {
    private int ano;
    private String modelo;

    public Automobile(int ano, String modelo) {
        this.ano = ano;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void oil_exchange(){

    }

    @Override
    public void acelerar() {

    }

    @Override
    public void freiar() {

    }
}
