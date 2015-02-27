public class Rectangle extends AbstractRectangle {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
