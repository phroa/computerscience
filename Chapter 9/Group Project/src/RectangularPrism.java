public class RectangularPrism extends AbstractCuboid {

    public RectangularPrism(double width, double height, double depth) {
        super(width, height, depth);
    }

    @Override
    public double getVolume() {
        return this.width * this.height * this.depth;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * ((this.width * this.height) + (this.height * this.depth) + (this.width * this.depth));
    }
}
