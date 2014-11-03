/**
 * Created by js on 9/23/14.
 */
public class Main {
    static final int CONSTANT = 100;

    public static void main(String[] args) {
        System.out.println("This message will self-detruct in:");
        for (int i=5;i>=1;i--) {
            System.out.println(i + " seconds");
            /*try {
                Thread.sleep(1000l);
            } catch (Exception e) {
                e.printStackTrace();
            }*/

            System.out.println(CONSTANT);

        }

        hi();

        System.out.println(CONSTANT);
    }

    public static void hi() {
        System.out.println("Hello world" + CONSTANT);
    }
}
