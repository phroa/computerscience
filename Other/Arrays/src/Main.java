import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bands = new ArrayList<String>() {{
            add("Red Hot Chili Peppers");
            add("Nirvana");
            add("Pearl Jam");
            add("Blues Travelor");
            add("The Gear Daddies");
        }};

        System.out.println(bands);

        bands.add("Guns n' Roses");

        System.out.println("----------");

        System.out.println(bands);

    }
}