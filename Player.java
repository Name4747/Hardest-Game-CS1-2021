
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Ethan Keene
 */
public class Player {
    private int x, y;
    private final static int WIDTH = 50, HEIGHT = 50, SPEED = 2;
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

     //7. implement method playerVsEnemy
    /**
     * Checks if player collides with an enemy
     * and respawns player if it does
     * @param enemy the enemy to check for collision against
     * @param start the player respawns in middle of start if collides with enemy
     */
    public void playerVsEnemy(Enemy enemy, Goal start) {
        Rectangle playerBounds = new Rectangle(x,y,WIDTH,HEIGHT);
        Rectangle enemyBounds = new Rectangle(enemy.getY(),enemy.getX(),enemy.getWIDTH(),enemy.getHEIGHT());
        if (playerBounds.intersects(enemyBounds)) {
            this.x = 
        }
    }

    //8.a. implement method isInBounds
    /**
     * Determines if player is still in bounds
     * @param border boundaries of the room
     * @return isInBounds Whether the player is in bounds or not
     */
     private boolean isInBounds(Border border) {
         
     }

    //9. implement method playerVsGoal
    /**
     * Determines if player reaches a goal
     * @param finish goal player might have reached
     * @return didReachGoal Whether the player reached the goal or not
     */
     public boolean playerVsGoal(Goal finish) {

     }

    public void move(int dx, int dy) {
    /**
     * Moves player as long as still in bounds
     * @param dx Change in x direction: -1, 0, or 1
     * @param dy Change in y direction: -1, 0, or 1
     * @param border Boundaries of room to ensure player is inbounds
     */
    public void move(int dx, int dy, Border border) {
        //8.b. player can only move if still in bounds
        
        x += SPEED * dx;
        y += SPEED * dy;
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
