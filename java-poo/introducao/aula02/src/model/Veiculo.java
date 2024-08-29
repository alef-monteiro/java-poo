package src.model;

public class Veiculo {
    private String modelo;
    private String placa;
    private int ano;
    private String cor;
    private String marca;

    public Veiculo(String marca, String modelo, String placa, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }

    public Veiculo(){
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s;\nModelo %s,\nPlaca: %s", marca, modelo, placa);

    }
}
