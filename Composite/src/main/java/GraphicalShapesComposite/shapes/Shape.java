package src.main.java.GraphicalShapesComposite.shapes;

import java.awt.*;

/**
 * This interface represents a shape in the context of a composite design pattern.
 * It provides methods for getting the position and size of the shape, moving the shape,
 * checking if a point is inside the shape's bounds, selecting and unselecting the shape,
 * checking if the shape is selected, and painting the shape.
 */
public interface Shape {
    /**
     * Returns the x coordinate of the shape.
     *
     * @return the x coordinate of the shape
     */
    int getX();

    /**
     * Returns the y coordinate of the shape.
     *
     * @return the y coordinate of the shape
     */
    int getY();

    /**
     * Returns the width of the shape.
     *
     * @return the width of the shape
     */
    int getWidth();

    /**
     * Returns the height of the shape.
     *
     * @return the height of the shape
     */
    int getHeight();

    /**
     * Moves the shape to the specified x and y coordinates.
     *
     * @param x the new x coordinate of the shape
     * @param y the new y coordinate of the shape
     */
    void move(int x, int y);

    /**
     * Checks if the specified point is inside the shape's bounds.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @return true if the point is inside the shape's bounds, false otherwise
     */
    boolean isInsideBounds(int x, int y);

    /**
     * Selects the shape.
     */
    void select();

    /**
     * Unselects the shape.
     */
    void unSelect();

    /**
     * Checks if the shape is selected.
     *
     * @return true if the shape is selected, false otherwise
     */
    boolean isSelected();

    /**
     * Paints the shape on the canvas.
     *
     * @param graphics the Graphics context in which to paint
     */
    void paint(Graphics graphics);
}