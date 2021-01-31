public class Cube extends Shape {
    private double side = 0;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }


    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2) * 6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
