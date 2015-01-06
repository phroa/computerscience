import java.awt.*;

/**
 * Created by js on 10/21/14.
 */
public class Main {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);

        // Need to get the panel's graphics before you can draw on them

        Graphics graphics = panel.getGraphics();

        //  making up a font and naming the font
        // (<name>, <style>, <size>)

        graphics.setFont( new Font("Small", Font.BOLD , 10));

        //  writing with your font afterward
        // (<name>, <x>, <y>)

        graphics.drawString("Hello", 10, 20);

        // you can set the font again. this one is bold and italic.
        graphics.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 22));

        // the line will go from (X, Y) to (X2, Y2)
        //                 X   Y  X2  Y2
        graphics.drawLine(40, 10, 80, 90);

        // Drawing Shapes:
        //
        // not-filled-in rectangle, starting at (40, 10) with a width of 80 and height of 90.
        graphics.drawRect(40, 10, 80, 90);

        // create a "new" color from three numbers
        graphics.setColor(new Color(190, 170, 150)); // set the color to be used to fill stuff in
        //           this bit is Red, Green, Blue
        //           values from 0 to 255, 255 being more of that color

        graphics.fillOval(380, 250, 90, 50);

        graphics.setColor(Color.PINK);

        // filled-in rectangle, starting at (240, 110) with a width of 80 and height of 90.
        // Uses the current graphics' color- see line 47
        graphics.fillRect(240, 110, 80, 90);
    }
}
