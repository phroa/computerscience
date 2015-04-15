public class Main {
    public static void main(String[] args) {
        System.out.println(evenDigits(123456));
        System.out.println(evenDigits(-2643));
        System.out.println(evenDigits(-1579));
    }

    private static int evenDigits(int n) {

        if (n < 0) return -evenDigits(-n);

        String number = Integer.toString(n);
        String output = "";

        for (char c : number.toCharArray()) {
            if (Integer.parseInt(String.valueOf(c)) % 2 == 1) {
                continue;
            }
            output += c;
        }

        if (output.equals("")) return 0;

        return Integer.parseInt(output);
    }
}
