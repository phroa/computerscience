package comparing;

import java.util.ArrayList;
import java.util.Collections;

public class ComparingDates {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList<Date>() {{
            add(new Date(3, 5, 1990));
            add(new Date(6, 3, 2000));
            add(new Date(7, 9, 2000));
            add(new Date(6, 9, 2000));
            add(new Date(6, 3, 2000));
            add(new Date(11, 12, 1897));
            add(new Date(1, 2, 1956));
            add(new Date(1, 1, 1956));
        }};

        System.out.println(dates);

        Collections.sort(dates);

        System.out.println(dates);

    }
}
