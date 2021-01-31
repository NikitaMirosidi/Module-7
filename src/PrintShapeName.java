public class PrintShapeName {
    public static void printShape(Shape obj) {
        System.out.println();
        System.out.println("Фигура - " + obj.getName());
        System.out.println("Периметр - " + obj.calculatePerimeter());
        System.out.println("Площадь - " + obj.calculateArea());
        System.out.println("Обьем - " + obj.calculateVolume());
        System.out.println();
    }
}
