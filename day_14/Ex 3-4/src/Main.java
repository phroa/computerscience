import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by js on 10/2/14.
 */
public class Main {
    public static void main(String[] args) {
        printSquare(3, 9);
    }

    private static void printSquare(int start, int end) {
        List<Integer> array = new ArrayList();
        for (int i=start;i<=end;i++) {
            array.add(i);
        }
        for (int i=array.size();i>0;i--) {
            String str = array.toString();
            str = str.replaceAll("\\[", "");
            str = str.replaceAll("\\]", "");
            str = str.replaceAll(",", "");

            System.out.println(str);

            Collections.rotate(array, -1);
        }
    }
}
