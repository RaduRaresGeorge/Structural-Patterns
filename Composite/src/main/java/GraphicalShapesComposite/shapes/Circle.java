package src.main.java.GraphicalShapesComposite.shapes;

import java.awt.*;

/**
 * This class represents a circle in the context of a composite design pattern.
 * It extends the BaseShape class and provides specific functionality for a circle.
 */
public class Circle extends BaseShape {
    /**
     * The radius of the circle.
     */
    public int radius;

    /**
     * Constructs a new circle with specified x and y coordinates, radius, and color.
     *
     * @param x the x coordinate of the circle
     * @param y the y coordinate of the circle
     * @param radius the radius of the circle
     * @param color the color of the circle
     */
    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    /**
     * Returns the width of the circle, which is twice the radius.
     *
     * @return the width of the circle
     */
    @Override
    public int getWidth() {
        return radius * 2;
    }

    /**
     * Returns the height of the circle, which is twice the radius.
     *
     * @return the height of the circle
     */
    @Override
    public int getHeight() {
        return radius * 2;
    }

    /**
     * Paints the circle on the canvas.
     * It calls the paint method of the superclass and then draws the circle.
     *
     * @param graphics the Graphics context in which to paint
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}