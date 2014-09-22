/**
 * Created by js on 9/22/14.
 */
public class CelsiusToFahrenheit {

    static String city = "Port Vila";
    static int currentTemperature = 19;

    static double ratio = 9.0/5.0;

    public static void main(String[] args) {
        System.out.println("The current weather in " + city + " is " + currentTemperature + "° C, let's see what that is in Fahrenheit.");

        double temp = currentTemperature * ratio;

        System.out.println("> 9/5 * " + currentTemperature + " = " + temp);

        temp += 32;

        System.out.println("> 32 + " + temp + " = " + temp);

        System.out.println("The temperature in " + city + " is " + ((int) temp) + "° F.");

    }
}
