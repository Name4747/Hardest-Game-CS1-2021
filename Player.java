
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ethan Keene
 */
public class Player {
    private int x, y;
    private final static int WIDTH = 50, HEIGHT = 50;
    //constant
    private final static Color COLOR = Color.RED;
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //1. draw outline on shape
    public void draw(Graphics g){
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, WIDTH, HEIGHT);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }
    
}