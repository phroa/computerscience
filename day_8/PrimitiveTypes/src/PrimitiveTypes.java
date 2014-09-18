/**
 * Created by js on 9/18/14.
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        // "declaring" variables

        int thisIsAnInteger = 9;
        double wowADecimal = 57.2;
        char justALetter = 'a';
        boolean trueOrFalse = false;

        System.out.println(String.format("%s %s %s %s", thisIsAnInteger, wowADecimal, justALetter, trueOrFalse));

        // the = sign doesn't mean "is equal to"
        // it puts a value into the variable

        /*
        thisIsAnInteger = 42;
        wowADecimal = 14.9;
        justALetter = 'B';
        trueOrFalse = true;
        */

        System.out.println(7+8);
        System.out.println(7-8);
        System.out.println(7*8);
        System.out.println(7/8);
        System.out.println(7%8);
        System.out.println(7.0/8.0);
        System.out.println(7.0/8);
        System.out.println(165%2); // if you need a computer to tell if a number is odd or even, you have bigger problems

        // "casting"

        System.out.println("Casting!");
        System.out.println((int)(7.0/8.0));

        // Order of operations

        System.out.println(6 + 7.0/8.0);

        // Math operations

        System.out.println(thisIsAnInteger + wowADecimal); // int + double

        double answer = thisIsAnInteger % wowADecimal;

        System.out.println(answer);

        // More casting

        System.out.println((int) wowADecimal);

        // Mixing a string and a variable

        System.out.println("A string concatenated with the value " + (int) wowADecimal + " and " + trueOrFalse);

    }
}
