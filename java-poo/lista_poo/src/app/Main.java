package app;


//Scanner scanner = new Scanner(System.in);
//Form[] formList = new Form[5];
//float ray;
//float height;
//float width;
//float size;


import controller.Controller;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Insert circles ray: ");
//        ray = scanner.nextFloat();
//        Circle circleItem = new Circle(ray);
//
//        System.out.println("Insert rectangle's measures\n Height: ");
//        height = scanner.nextFloat();
//
//        System.out.println("\n -Width: ");
//        width = scanner.nextFloat();
//        Rectangle rectangle = new Rectangle(height, width);
//
//        System.out.println("Insert square's side: ");
//        size = scanner.nextFloat();
//        Square square = new Square(size);
        Controller menu = new Controller();
        menu.MenuForms();

    }
}