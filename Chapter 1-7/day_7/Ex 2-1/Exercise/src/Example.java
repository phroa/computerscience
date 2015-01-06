/**
 * Created by js on 9/16/14.
 * chapter 2 exercise 1
 */
public class Example {
    public static void main(String[] args) { // for sake of sanity, trust me when I say that `java Example 12.6 5.1 6.8 5.1` results in 495.618
        System.out.println((float) compute(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3])));
    }

    private static double compute(double time, double initialPosition, double initialVelocity, double accelerationRate) {
        return initialPosition + initialVelocity * time + (accelerationRate * Math.pow(time, 2))/2;
    }
}
