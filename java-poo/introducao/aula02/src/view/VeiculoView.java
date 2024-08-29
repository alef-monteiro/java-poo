package src.view;

import src.controller.VeiculoController;

import java.util.Scanner;

public class VeiculoView {
    private Scanner scanner = new Scanner(System.in);

    VeiculoController veiculoController = new VeiculoController();

    public void menu() {
        int opcao = 0;

        System.out.println(" Cadastrar Veiculo ");
        do {
            System.out.println("1 - Cadastrar Veiculo");
            System.out.println("2 - Listar Veiculo");
            System.out.println("0 - Sair");
            System.out.print((" - "));
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1 Implementar o metodo cadastrar aqui! ");
                    veiculoController.AddVeiculo();
                    break;
                case 2:
                    System.out.println("2 Implementar o metodo listar aqui! ");
                    veiculoController.ShowVeiculo();
                    break;
                case 0:
                    System.out.println("0 Saindo do sistema...");
                    break;
                default:
                    System.out.println(" Opção invalida!");
                    break;
            }

        } while (opcao != 0);

    }
}
