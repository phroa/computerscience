public class Square extends AbstractRectangle {

    public Square(double size) {
        super(size, size);
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
