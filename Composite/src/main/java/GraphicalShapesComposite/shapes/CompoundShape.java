package src.main.java.GraphicalShapesComposite.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class represents a compound shape in the context of a composite design pattern.
 * It extends the BaseShape class and manages a list of child shapes.
 */
public class CompoundShape extends BaseShape {
    protected List<Shape> children = new ArrayList<>();

    /**
     * Constructs a new compound shape with specified components.
     * It initializes the compound shape with a black color and adds the components.
     *
     * @param components the components of the compound shape
     */
    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    /**
     * Adds a component to the compound shape.
     *
     * @param component the component to be added
     */
    public void add(Shape component) {
        children.add(component);
    }

    /**
     * Adds multiple components to the compound shape.
     *
     * @param components the components to be added
     */
    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    /**
     * Removes a component from the compound shape.
     *
     * @param child the component to be removed
     */
    public void remove(Shape child) {
        children.remove(child);
    }

    /**
     * Removes multiple components from the compound shape.
     *
     * @param components the components to be removed
     */
    public void remove(Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    /**
     * Clears all components from the compound shape.
     */
    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        if (children.size() == 0) {
            return 0;
        }
        int x = children.get(0).getX();
        for (Shape child : children) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (children.size() == 0) {
            return 0;
        }
        int y = children.get(0).getY();
        for (Shape child : children) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (Shape child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (Shape child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for (Shape child : children) {
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for (Shape child : children) {
            child.unSelect();
        }
    }

    /**
     * Selects a child at the specified coordinates.
     * It iterates over the children and selects the first child that is inside the bounds of the specified coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @return true if a child was selected, false otherwise
     */
    public boolean selectChildAt(int x, int y) {
        for (Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }
        return false;
    }

    /**
     * Paints the compound shape on the canvas.
     * If the compound shape is selected, it enables the selection style and draws a rectangle around the compound shape.
     * Then it disables the selection style and paints the child shapes.
     *
     * @param graphics the Graphics context in which to paint
     */
    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (Shape child : children) {
            child.paint(graphics);
        }
    }
}
