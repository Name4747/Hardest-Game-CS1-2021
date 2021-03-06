
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ethan Keene
 */
public class Enemy {
    private int x, y, vx, vy;
    private final static int SPEED = 5;
    private final static int WIDTH = 25, HEIGHT = 25;
    private final static Color COLOR = Color.BLUE;

    //4.a constructor
    public Enemy(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    //4.b draws a circle (oval)
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, WIDTH, HEIGHT);
    }
    
    //6.a. implement method collideWorldBounds
    /**
     * Checks if enemy hits border, if so, turns around
     * @param border Boundaries of the room
     */
    public void collideWorldBounds(Border border) {
        if(this.y <= border.getY()) {
            this.vy *= -1;
        }
        if(this.y >= border.getY() + border.getHeight() - this.HEIGHT) {
            this.vy *= -1;
        }
    }
    
    public void move() {
        x += SPEED * vx;
        y += SPEED * vy;
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
