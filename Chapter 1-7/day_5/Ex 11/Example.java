public class Example {
    public static void main(String[] args) {
        stars();
        cross();
        space();
        stars();
        cross();
        stars();
        space();
        for (int i=0;i<3;i++) star();
        stars();
        cross();
    }

    public static void stars() {
        for (int i=0;i<2;i++) System.out.println("*****");
    }

    public static void cross() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    public static void space() {
        for (int i=0;i<2;i++) System.out.println();
    }

    public static void star() {
        System.out.println("  *");
    }
}
