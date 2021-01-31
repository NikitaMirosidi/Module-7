public class Sphere extends Shape {
    private double radius = 0;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * 4 * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 3) * 4.0/3.0;
    }
}
