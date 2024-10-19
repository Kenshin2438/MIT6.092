package assn5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(150, 50, Color.GREEN));
        boxes.add(new BouncingBox(100, 50, Color.BLUE));

        int[][] directions = { { -1, 0 }, { 0, 1 }, { 1, 1 } };
        for (int i = 0; i < 3; i++) {
            boxes.get(i).setMovementVector(directions[i][0], directions[i][1]);
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
}