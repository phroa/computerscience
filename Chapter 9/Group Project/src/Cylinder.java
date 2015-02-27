public class Cylinder implements ThreeDimensionalShape {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public double getSurfaceArea() {
        return (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * this.radius * this.radius);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }
}
