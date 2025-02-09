package assn6;

import java.awt.Graphics;

public class StraightMover extends BaseMover implements Mover {
    public StraightMover(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);

        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;
    }
}
