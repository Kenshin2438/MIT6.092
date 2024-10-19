package assn6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movingSprites = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        movingSprites.add(new Bouncer(100, 170, box1));

        Oval oval1 = new Oval(15, 20, Color.BLUE);
        movingSprites.add(new Bouncer(100, 170, oval1));

        Rectangle box2 = new Rectangle(15, 20, Color.RED);
        movingSprites.add(new StraightMover(100, 170, box2));

        Oval oval2 = new Oval(15, 20, Color.BLUE);
        movingSprites.add(new StraightMover(100, 170, oval2));

        int[][] directions = { { -2, 0 }, { 0, 2 }, { 2, 2 }, { 2, -2 } };
        for (int i = 0; i < 4; i++) {
            movingSprites.get(i).setMovementVector(directions[i][0], directions[i][1]);
        }
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover movingSprite : movingSprites) {
            movingSprite.draw(surface);
        }
    }
}
