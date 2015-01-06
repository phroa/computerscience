package data;

import java.awt.*;

/**
 * Created by js on 10/28/14.
 */
public enum Colors {
    LIGHT(new Color(176, 176, 176)),
    MEDIUM(new Color(116, 116, 116)),
    DARK(new Color(37, 37, 37));

    private final Color c;
    Colors(Color color) {
        c = color;
    }

    public Color get() {
        return c;
    }
}
