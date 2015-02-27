public abstract class AbstractCuboid implements ThreeDimensionalShape {
    protected double width;
    protected double height;
    protected double depth;

    public AbstractCuboid(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}
