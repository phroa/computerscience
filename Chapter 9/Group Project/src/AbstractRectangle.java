public abstract class AbstractRectangle implements TwoDimensionalShape {
    protected double width;
    protected double height;

    public AbstractRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}