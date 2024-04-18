package src.main.java.GraphicalShapesComposite.shapes;

import java.awt.*;

/**
 * This abstract class represents a base shape in the context of a composite design pattern.
 * It implements the Shape interface and provides common functionality for all shapes.
 */
abstract class BaseShape implements Shape {
    public int x;
    public int y;
    public Color color;
    private boolean selected = false;

    /**
     * Constructs a new base shape with specified x and y coordinates and color.
     *
     * @param x the x coordinate of the shape
     * @param y the y coordinate of the shape
     * @param color the color of the shape
     */
    BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

    @Override
    public void select() {
        selected = true;
    }

    @Override
    public void unSelect() {
        selected = false;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    /**
     * Enables the selection style for the shape.
     * It sets the color to light gray and the stroke to dashed.
     *
     * @param graphics the Graphics context in which to enable the selection style
     */
    void enableSelectionStyle(Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graphics;
        float[] dash1 = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash1, 0.0f));
    }

    /**
     * Disables the selection style for the shape.
     * It sets the color to the original color and the stroke to solid.
     *
     * @param graphics the Graphics context in which to disable the selection style
     */
    void disableSelectionStyle(Graphics graphics) {
        graphics.setColor(color);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }

    /**
     * Paints the shape on the canvas.
     * If the shape is selected, it enables the selection style, otherwise it disables the selection style.
     *
     * @param graphics the Graphics context in which to paint
     */
    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
        }
        else {
            disableSelectionStyle(graphics);
        }

        // ...
    }
}