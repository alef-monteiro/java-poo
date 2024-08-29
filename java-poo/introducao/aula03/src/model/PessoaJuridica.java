package src.model;

import src.absModel.Pessoa;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public PessoaJuridica(String CNPJ,String nome, String telefone, String endereco) {
        this.CNPJ = CNPJ;
        super.nome = nome;
        super.telefone = telefone;
        super.endereco = endereco;
    }



    @Override
    public String toString() {
        return "";
    }
}
