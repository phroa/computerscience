public class Cube extends AbstractCuboid {

    public Cube(double size) {
        super(size, size, size);
    }

    @Override
    public double getVolume() {
        return this.width * this.width * this.width;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * (this.width * this.width);
    }

}
