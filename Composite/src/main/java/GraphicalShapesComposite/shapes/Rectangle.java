package src.main.java.GraphicalShapesComposite.shapes;

import java.awt.*;

/**
 * This class represents a rectangle in the context of a composite design pattern.
 * It extends the BaseShape class and provides specific functionality for a rectangle.
 */
public class Rectangle extends BaseShape {
    /**
     * The width of the rectangle.
     */
    public int width;

    /**
     * The height of the rectangle.
     */
    public int height;

    /**
     * Constructs a new rectangle with specified x and y coordinates, width, height, and color.
     *
     * @param x the x coordinate of the rectangle
     * @param y the y coordinate of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @param color the color of the rectangle
     */
    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the rectangle.
     *
     * @return the height of the rectangle
     */
    @Override
    public int getHeight() {
        return height;
    }

    /**
     * Paints the rectangle on the canvas.
     * It calls the paint method of the superclass and then draws the rectangle.
     *
     * @param graphics the Graphics context in which to paint
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}