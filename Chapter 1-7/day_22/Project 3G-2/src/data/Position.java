package data;

/**
 * Created by js on 10/28/14.
 */
public enum Position {
    TOP(25),
    MIDDLE(75),
    BOTTOM(125),

    LEFT(25),
    CENTER(75),
    RIGHT(125);

    private int i;
    Position(int i) {
        this.i = i;
    }

    public int get() {
        return i;
    }
}
