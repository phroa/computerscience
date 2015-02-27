public class Main {
    public static void main(String[] args) {
        Shape[] yolo = {new Cylinder(11, 7.26), new Cube(9.43), new Square(34), new Rectangle(6, 14), new Sphere(24)};

        for (Shape x : yolo) {
            System.out.println(x.getClass().getName() + ":");
            if (x instanceof TwoDimensionalShape) {
                System.out.println("It's two-dimensional.");
                TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) x;

                System.out.println("Area, perimeter:");
                System.out.println(twoDimensionalShape.getArea());
                System.out.println(twoDimensionalShape.getPerimeter());
            } else if (x instanceof ThreeDimensionalShape) {
                System.out.println("It's three-dimensional.");
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) x;

                System.out.println("Volume, surface area:");
                System.out.println(threeDimensionalShape.getVolume());
                System.out.println(threeDimensionalShape.getSurfaceArea());
            }
            System.out.println();
        }
    }
}
