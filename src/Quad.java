public class Quad extends Shape{
    private double side = 0;

    public Quad(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
