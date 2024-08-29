package app;

import model.Person;
import model.TiposVariavel;

public class Main {
    public static void main(String[] args) {
        TiposVariavel nomeDaVariavel = new TiposVariavel();
        nomeDaVariavel.show();
        nomeDaVariavel.setA((byte)1);

        Person Pessoa = new Person();
        System.out.println("Nome: " + Pessoa.toString());

    }
}

