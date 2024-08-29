package src.model;

import src.absModel.Pessoa;

public class PessoaFisica extends Pessoa {
    private String CPF;

    public PessoaFisica(String CPF,String nome, String telefone, String endereco) {
        this.CPF = CPF;
        super.nome = nome;
        super.telefone = telefone;
        super.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


    @Override
    public String toString() {
        return "";
    }


}
