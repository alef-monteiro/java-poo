package controller;

import java.util.Scanner;

import absModel.Form;
import model.Circle;
import model.Rectangle;
import model.Square;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Form[] formList = new Form[5];
    float ray;
    float height;
    float width;
    float size;

   public void MenuForms() {
        System.out.print("Insert circles ray: ");
        ray = scanner.nextFloat();
        Circle circleItem = new Circle(ray);

        System.out.print("Insert rectangle's measures\n-Height: ");
        height = scanner.nextFloat();

        System.out.print("-Width: ");
        width = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(height, width);

        System.out.print("Insert square's side: ");
        size = scanner.nextFloat();
        Square square = new Square(size);
    }

    public void 
}


