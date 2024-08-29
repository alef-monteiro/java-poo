package src.absModel;

public abstract class Veiculo {
    public String placa;
    public int combustivelNoTanque;
    public int quilometragem;
    public boolean alugado;
    public double precoDiaria;

    public void abastecer(int combustivel) {
        combustivelNoTanque+=combustivel;
    }

    public boolean viajar(int distancia){
        alugado = true;
        return true;
    }

    @Override
    public abstract String toString();

}
