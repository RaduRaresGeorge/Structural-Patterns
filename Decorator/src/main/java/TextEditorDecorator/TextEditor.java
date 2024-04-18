package src.main.java.TextEditorDecorator;

/**
 * This class represents a simple text editor.
 * It provides methods for writing text to and reading text from the editor.
 */
public class TextEditor {
    private String text;

    /**
     * Writes the specified text to the editor.
     *
     * @param newText the text to be written
     */
    public void write(String newText) {
        text = newText;
    }

    /**
     * Reads the text from the editor.
     *
     * @return the text read from the editor
     */
    public String read() {
        return text;
    }
}