package src.main.java.TextEditorDecorator;

/**
 * This abstract class represents a TextEditorDecorator that decorates a text editor.
 * It extends the TextEditor class and provides methods for writing text to and reading text from the decorated text editor.
 */
public abstract class TextEditorDecorator extends TextEditor {
    protected TextEditor decoratedTextEditor;

    /**
     * Constructs a new TextEditorDecorator with the specified text editor.
     *
     * @param decoratedTextEditor the text editor to be decorated
     */
    public TextEditorDecorator(TextEditor decoratedTextEditor) {
        this.decoratedTextEditor = decoratedTextEditor;
    }

    /**
     * Writes the specified text to the decorated text editor.
     *
     * @param newText the text to be written
     */
    @Override
    public void write(String newText) {
        decoratedTextEditor.write(newText);
    }

    /**
     * Reads the text from the decorated text editor.
     *
     * @return the text read from the decorated text editor
     */
    @Override
    public String read() {
        return decoratedTextEditor.read();
    }
}