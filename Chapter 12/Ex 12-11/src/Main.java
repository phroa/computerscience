public class Main {
    public static void main(String[] args) {
        System.out.println(isReverse("test string", "GNiRTS tsET"));
        System.out.println(isReverse("test string", "GNiRTS tset"));
        System.out.println(isReverse("test string", "GNiRTS test"));
        System.out.println(isReverse("123", "321"));
    }

    private static boolean isReverse(String a, String b) {
        if (a.length() != b.length()) return false;

        if (a.length() == 0 || a.length() == 1) return true;

        if (a.toLowerCase().charAt(0) != b.toLowerCase().charAt(b.length() - 1)) return false;

        return isReverse(a.substring(1), b.substring(0, b.length() - 1));
    }
}
