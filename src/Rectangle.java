public class Rectangle extends Shape{
    private double bigSide = 0;
    private double smallSide = 0;

    public Rectangle(String name, double bigSide, double smallSide) {
        super(name);
        this.bigSide = bigSide > smallSide ? bigSide : smallSide;
        this.smallSide = smallSide < bigSide ? smallSide : bigSide;
    }

    @Override
    public double calculatePerimeter() {
        return bigSide * 2 + smallSide * 2;
    }

    @Override
    public double calculateArea() {
        return bigSide * smallSide;
    }
}
