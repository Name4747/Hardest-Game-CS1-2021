
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ethan Keene
 */
public class Enemy {
    private int x, y, vx, vy;
    private final static int SPEED = 2;
    private final static int WIDTH = 25, HEIGHT = 25;
    private final static Color COLOR = Color.BLUE;

    //4.a constructor
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //4.b draws a circle (oval)
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, WIDTH, HEIGHT);
    }
    
    //4.c getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public static int getSPEED() {
        return SPEED;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
    
}
