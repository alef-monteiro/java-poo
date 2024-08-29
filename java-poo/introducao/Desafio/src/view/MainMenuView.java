package src.view;

import java.util.Scanner;

public class MainMenuView {
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int op;

        System.out.println("-- Main menu --");
        do {
            System.out.print(" 1 - Course");
            System.out.print(" 2 - Student");
            System.out.print(" 0 - Exit");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n --------------- \n");
                    break;
                case 2:
                    System.out.println("\n --------------- \n");
                    break;

                default:
                    System.out.println("\n Invalid.");
            }

        } while (op != 0);
    }
}
