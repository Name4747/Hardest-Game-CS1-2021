
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ethan Keene
 */
public class Border {
    private final int x, y, width, height;
    private final static Color COLOR = Color.BLACK;

    //2.a. constructor for Border
    public Border(int x, int y) {
        this.width = 50;
        this.height = 50;
        this.x = x;
        this.y = y;
    }
    //2.b draws a rectangle
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, width, height);
    }

    //2.c getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
    
}
