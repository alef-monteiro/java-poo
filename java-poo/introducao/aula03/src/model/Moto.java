package src.model;

import src.absModel.Veiculo;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(int cilindradas, String placa, int combustivel, int km, double preco) {
        this.cilindradas = cilindradas;
        super.placa = placa;
        super.combustivelNoTanque = combustivel;
        super.quilometragem = km;
        super.precoDiaria = preco;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }



    @Override
    public String toString() {
        return "";
    }
}
