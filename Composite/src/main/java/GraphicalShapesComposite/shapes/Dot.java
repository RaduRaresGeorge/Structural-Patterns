package src.main.java.GraphicalShapesComposite.shapes;

import java.awt.*;

/**
 * This class represents a dot in the context of a composite design pattern.
 * It extends the BaseShape class and provides specific functionality for a dot.
 */
public class Dot extends BaseShape {
    /**
     * The size of the dot.
     */
    private final int DOT_SIZE = 3;

    /**
     * Constructs a new dot with specified x and y coordinates and color.
     *
     * @param x the x coordinate of the dot
     * @param y the y coordinate of the dot
     * @param color the color of the dot
     */
    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    /**
     * Returns the width of the dot, which is the size of the dot.
     *
     * @return the width of the dot
     */
    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    /**
     * Returns the height of the dot, which is the size of the dot.
     *
     * @return the height of the dot
     */
    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    /**
     * Paints the dot on the canvas.
     * It calls the paint method of the superclass and then fills a rectangle for the dot.
     *
     * @param graphics the Graphics context in which to paint
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}