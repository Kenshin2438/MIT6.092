package assn6;

import java.awt.Graphics;

public abstract class BaseMover {

    protected int x;
    protected int y;
    protected int xDirection;
    protected int yDirection;
    protected Sprite sprite;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public BaseMover(int startX, int startY, Sprite sprite) {
        this.x = startX;
        this.y = startY;
        this.sprite = sprite;
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    public abstract void draw(Graphics surface);
}
