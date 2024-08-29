package src.view;

import java.util.Scanner;

public class CourseView {
    private Scanner scanner = new Scanner(System.in);

    private void courseMenu() {
        int op;

        do {
            System.out.println(" 1 - Register course");
            System.out.println(" 2 - Edit");
            System.out.println(" 3 - List");
            System.out.println(" 0 - Back");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n Invalid.");
            }
        } while (op != 0);
    }
}
