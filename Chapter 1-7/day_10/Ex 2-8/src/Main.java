/**
 * Created by js on 9/23/14.
 */
public class Main {
    public static void main(String[] args) {
        int end = 6;
        for (int i=1;i<end;i++) {
            for (int j=end-1;j>i;j--) System.out.print(" ");
            for (int j=i;j>0;j--) System.out.print(i);
            System.out.print("\n");
        }
    }
}
