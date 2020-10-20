
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ethan Keene
 */
public class Goal {
    private int x, y;
    private final int width, height;
    private final boolean isFinish;
    private final static Color COLOR = new Color(187,255,180);

    //3.a. constructor for Border
    public Goal(int x, int y, int width, int height, boolean isFinish) {
        this.isFinish = false;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    //3.b draws a rectangle
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, width, height);
    }

    //3.c getters

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

    public boolean setIsFinish() {
        return isFinish;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
    
}
