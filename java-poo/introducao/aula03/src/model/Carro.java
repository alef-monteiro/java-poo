package src.model;

import src.absModel.Veiculo;

public class Carro extends Veiculo {
    public Carro(double potencia, String placa, int combustivel, int km, double preco) {
        this.potencia = potencia;
        super.placa = placa;
        super.combustivelNoTanque = combustivel;
        super.quilometragem = km;
        super.precoDiaria = preco;
    }

    private double potencia;

    @Override
    public String toString() {
        return "";
    }
}
