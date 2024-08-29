package src.controller;

import src.model.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoController {
    private ArrayList<Veiculo> VeiculoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void AddVeiculo() {
        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.next();

        System.out.print("Placa: ");
        String placa = scanner.next();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Cor: ");
        String cor = scanner.next();

        Veiculo v = new Veiculo(marca, modelo, placa, ano, cor);
        VeiculoList.add(v);
    }

    public void ShowVeiculo() {
        for (int i = 0; i < VeiculoList.size(); i++) {
            Veiculo item;
            item = VeiculoList.get(i);
            System.out.println("\n Veiculo" + i + ":\n " + item);
            System.out.println();
        }

        //if (veiculos.isEmpty()) {
        //}
    }
}
