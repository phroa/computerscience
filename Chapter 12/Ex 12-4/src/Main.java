public class Main {
    public static void main(String[] args) {
        System.out.println(doubleDigits(378));
        System.out.println(doubleDigits(0));
        System.out.println(doubleDigits(-0));
        System.out.println(doubleDigits(-12345));
    }

    private static int doubleDigits(int n) {
        if (n == 0) return 0;
        if (n < 0) {
            return -doubleDigits(-n);
        }

        String number = Integer.toString(n);
        String result = "";

        for (char c : number.toCharArray())
            result += c + "" + c;

        return Integer.parseInt(result);
    }
}
