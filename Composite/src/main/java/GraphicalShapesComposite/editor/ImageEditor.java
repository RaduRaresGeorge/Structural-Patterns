package src.main.java.GraphicalShapesComposite.editor;

import src.main.java.GraphicalShapesComposite.shapes.CompoundShape;
import src.main.java.GraphicalShapesComposite.shapes.Shape;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * This class represents an image editor that uses the composite design pattern.
 * It manages a compound shape of all shapes and provides methods to load shapes and handle mouse events.
 */
public class ImageEditor {
    private EditorCanvas canvas;
    private CompoundShape allShapes = new CompoundShape();

    /**
     * Constructs a new image editor and initializes the canvas.
     */
    public ImageEditor() {
        canvas = new EditorCanvas();
    }

    /**
     * Loads the specified shapes into the image editor.
     * It clears all existing shapes, adds the new shapes, and refreshes the canvas.
     *
     * @param shapes the shapes to be loaded
     */
    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    /**
     * This class represents the canvas of the image editor.
     * It manages a JFrame and provides methods to create the frame, get the width and height, refresh the canvas, and paint the shapes.
     */
    private class EditorCanvas extends Canvas {
        JFrame frame;

        private static final int PADDING = 10;

        /**
         * Constructs a new canvas, creates the frame, refreshes the canvas, and adds a mouse listener to handle mouse events.
         */
        EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unSelect();
                    allShapes.selectChildAt(e.getX(), e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        /**
         * Creates the frame of the canvas.
         * It initializes the frame, sets the default close operation, sets the location relative to null,
         * creates a content panel with padding, sets the content pane of the frame, adds the canvas to the frame,
         * makes the frame visible, and sets the background color of the content pane.
         */
        void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        /**
         * Returns the width of the canvas.
         *
         * @return the width of the canvas
         */
        public int getWidth() {
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        /**
         * Returns the height of the canvas.
         *
         * @return the height of the canvas
         */
        public int getHeight() {
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        /**
         * Refreshes the canvas.
         * It sets the size of the canvas and packs the frame.
         */
        void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        /**
         * Paints the shapes on the canvas.
         *
         * @param graphics the Graphics context in which to paint
         */
        public void paint(Graphics graphics) {
            allShapes.paint(graphics);
        }
    }
}