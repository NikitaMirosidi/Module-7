import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int userChoice;

            while (true) {
                System.out.println("Выберите фигуру:");
                System.out.println("Введите <1>, если интересует окружность");
                System.out.println("Введите <2>, если интересует квадрат");
                System.out.println("Введите <3>, если интересует прямоугольник");
                System.out.println("Введите <4>, если интересует сфера");
                System.out.println("Введите <5>, если интересует куб");
                System.out.println("Введите любое другое число для выхода");
                System.out.print("-> ");

                try {
                    userChoice = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Принимаются только целые числа. Попробуйте еще");
                }
                scanner.nextLine();
            }
            getShape(userChoice);
            if (!(userChoice > 0 && userChoice < 6)){
                break;
            }
        }
        scanner.close();
    }

    public static void getShape(int userChoice) {

            if (userChoice == 1) {
                System.out.println();
                System.out.println("Вы выбрали окружность");
                System.out.println("Укажите радиус окружности");
                Shape shape = new Circle("Окружность", getData());
                PrintShapeName.printShape(shape);
            } else if (userChoice == 2) {
                double choice;
                System.out.println();
                System.out.println("Вы выбрали квадрат");
                System.out.println("Укажите сторону квадрата");
                Shape shape = new Quad("Квадрат", getData());
                PrintShapeName.printShape(shape);
            } else if (userChoice == 3) {
                double a;
                double b;
                System.out.println();
                System.out.println("Вы выбрали прямоугольник");
                System.out.println("Укажите первую сторону прямоугольника");
                a = getData();
                System.out.println("Укажите вторую сторону прямоугольника");
                b = getData();
                Shape shape = new Rectangle("Прямоугольник", a, b);
                PrintShapeName.printShape(shape);
            } else if (userChoice == 4) {
                double choice;
                System.out.println();
                System.out.println("Вы выбрали сферу");
                System.out.println("Укажите радиус сферы: ");
                Shape shape = new Sphere("Сфера", getData());
                PrintShapeName.printShape(shape);
            } else if (userChoice == 5) {
                double choice;
                System.out.println();
                System.out.println("Вы выбрали куб");
                System.out.println("Укажите сторону куба: ");
                Shape shape = new Cube("Куб", getData());
                PrintShapeName.printShape(shape);
            } else {
                System.out.println("Спасибо за пользование нашей программой! До свидания!");
            }
    }

    public static double getData() {
        Scanner scanner2 = new Scanner(System.in);
        double choice;

        while (true){
            System.out.print("Ввод: ");
            try {
                choice = scanner2.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Принимаются только цифры. Попробуйте еще");
            }
            scanner2.nextLine();
        }
        //scanner2.close();
        return choice;
    }
}